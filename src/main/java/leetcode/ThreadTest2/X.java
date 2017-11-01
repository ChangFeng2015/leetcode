package leetcode.ThreadTest2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Dave on 2017/9/25.
 */
public class X {

    private final ReentrantLock lock = new ReentrantLock();

    public void m(){
        lock.lock();
        try{
            System.out.println("abc");
        }finally {
            lock.unlock();
        }
    }
}
