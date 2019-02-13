package leetCode.concurrent2;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/30 11:01
 * @Version 1.0
 **/
public class MyThread extends Thread {
    private CountDownLatch maxRunner;

    public MyThread(CountDownLatch maxRunner) {
        this.maxRunner = maxRunner;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            maxRunner.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
