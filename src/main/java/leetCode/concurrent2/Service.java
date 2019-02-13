package leetCode.concurrent2;

import java.util.concurrent.Semaphore;

/**
 * @ClassName Service
 * @Description java并发编程核心方法与框架示例
 * @Author Dave
 * @Date 2018/10/29 21:12
 * @Version 1.0
 **/
public class Service {

    private Semaphore semaphore = new Semaphore(3);

    public void testMethod() {
        try {
            semaphore.acquire();
            System.out.println("ThreadName : " + Thread.currentThread().getName() + "准备！");
            System.out.println("begin : " + System.currentTimeMillis());
            for (int i = 0; i < 5; i ++) {
                System.out.println(Thread.currentThread().getName() + "打印" + (i + 1));
            }
            System.out.println("end : " + System.currentTimeMillis());
            semaphore.release();
            System.out.println("ThredName : " + Thread.currentThread().getName() + "结束！");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
