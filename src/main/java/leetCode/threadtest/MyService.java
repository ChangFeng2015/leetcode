package leetCode.threadtest;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName MyService
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/18 16:55
 * @Version 1.0
 **/
public class MyService {

    private CountDownLatch latch = new CountDownLatch(1);

    public void testMethod() {
        try {
            System.out.println(Thread.currentThread().getName() + "准备");
            latch.await();
            System.out.println(Thread.currentThread().getName() + "结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void downMethod() {
        System.out.println("开始");
        latch.countDown();
    }
}
