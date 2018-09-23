package leetCode.threadtest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName MyService2
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/19 17:38
 * @Version 1.0
 **/
public class MyService2 {

    public CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
        @Override
        public void run() {
            System.out.println("彻底结束了" + System.currentTimeMillis());
        }
    });

    public void testMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "准备!" + System.currentTimeMillis());
            if (Thread.currentThread().getName().equals("C")) {
                Thread.sleep(Integer.MAX_VALUE);
            }
            cyclicBarrier.await();
            System.out.println(Thread.currentThread().getName() + " 开始！" + System.currentTimeMillis());
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
