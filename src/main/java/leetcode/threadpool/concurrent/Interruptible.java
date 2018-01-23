package leetcode.threadpool.concurrent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 七周七并发学习--ReentrantLock
 *
 * @author Dave
 * @create 2018-01-23 20:02
 **/
public class Interruptible {

    private static final Logger LOGGER = LoggerFactory.getLogger(Interruptible.class);

    final ReentrantLock l1 = new ReentrantLock();
    final ReentrantLock l2 = new ReentrantLock();

    Thread t1 = new Thread() {
      @Override
      public void run() {
          try {
              l1.lockInterruptibly();
              Thread.sleep(1000);
              l2.lockInterruptibly();
          } catch (InterruptedException e) {
              LOGGER.error("thread run error : ", e);
          }
      }
    };
}


class ConcurrentSortedList {

    private class Node {
        int value;
        Node prev;
        Node next;
        ReentrantLock lock = new ReentrantLock();

        Node() {

        }

        Node(int value, Node prev, Node next) {
            this.value  = value;
            this.prev = prev;
            this.next = next;
        }
    }

    private final Node head;
    private final Node tail;

    public ConcurrentSortedList() {
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.prev = head;
    }

    public void insert(int value) {
        Node current = head;
        current.lock.lock();
        Node next = current.next;

        try {
            while (true) {
                next.lock.lock();
                try {
                    if (next == tail || next.value < value) {
                        Node node = new Node(value, current, next);
                        next.prev = node;
                        current.next = node;
                        return;
                    }
                } finally {
                    current.lock.unlock();
                }
                current = next;
                next = current.next;
            }
        } finally {
            next.lock.unlock();
        }

    }

}
