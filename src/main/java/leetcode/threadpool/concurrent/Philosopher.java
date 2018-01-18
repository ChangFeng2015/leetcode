package leetcode.threadpool.concurrent;

import java.util.Random;

/**
 * 哲学家进餐
 *
 * @author Dave
 *
 */
public class Philosopher extends Thread {

    private String left, right;
    private Random random;

    public Philosopher(String left, String right) {
        this.left = left;
        this.right = right;
        random = new Random();
    }

    @Override
    public void run() {
        try {
            while (true) {
                Thread.sleep(random.nextInt(1000));
                synchronized (left) {
                    synchronized (right) {
                        Thread.sleep(random.nextInt(1000));
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
