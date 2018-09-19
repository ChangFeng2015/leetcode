package leetCode.threadtest;

import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName Test2
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/19 16:28
 * @Version 1.0
 **/
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        CyclicBarrier cbRef = new CyclicBarrier(3);

        ThreadA threadA1 = new ThreadA(cbRef);
        threadA1.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());

        ThreadA threadA2 = new ThreadA(cbRef);
        threadA2.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());

        ThreadA threadA3 = new ThreadA(cbRef);
        threadA3.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());

        ThreadA threadA4 = new ThreadA(cbRef);
        threadA4.start();
        Thread.sleep(500);
        System.out.println(cbRef.getNumberWaiting());
    }
}
