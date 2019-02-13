package leetCode.concurrent2;

import java.util.concurrent.Semaphore;

/**
 * @ClassName MyService
 * @Description java并发编程核心方法与框架示例
 * @Author Dave
 * @Date 2018/10/30 10:58
 * @Version 1.0
 **/
public class MyService {

    private boolean isFair = true;
    private Semaphore semaphore = new Semaphore(1, isFair);

    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println("thread name : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
