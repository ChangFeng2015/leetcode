package leetCode.threadtest;

import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName Run
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/18 17:00
 * @Version 1.0
 **/
public class Run {

    public static void main(String[] args) throws InterruptedException {
//        CountDownLatch comingTag = new CountDownLatch(10);
//        CountDownLatch waitTag = new CountDownLatch(1);
//        CountDownLatch waitRunTag = new CountDownLatch(10);
//        CountDownLatch beginTag = new CountDownLatch(1);
//        CountDownLatch endTag = new CountDownLatch(10);
//
//        MyThread[] threads = new MyThread[10];
//        for (int i = 0; i < threads.length; i++) {
//            threads[i] = new MyThread(comingTag, waitTag, waitRunTag, beginTag, endTag);
//            threads[i].start();
//        }
//
//        System.out.println("裁判正在等待选手的到来！");
//        comingTag.await();
//        System.out.println("裁判看到选手们都来了，各就各位前巡视5秒");
//        Thread.sleep(5000);
//        waitTag.countDown();
//        System.out.println("各就各位");
//        waitRunTag.await();
//        Thread.sleep(2000);
//        System.out.println("发令枪响起！");
//        beginTag.countDown();
//        endTag.await();
//        System.out.println("所有的人到达终点！");

//        MyService service = new MyService();
//        MyThread[] tArray = new MyThread[3];
//        for (int i = 0; i < tArray.length; i ++) {
//            tArray[i] = new MyThread(service);
//        }
//
//        for (int i = 0; i < tArray.length; i ++) {
//            tArray[i].start();
//        }
//        CountDownLatch count = new CountDownLatch(3);
//        System.out.println("main getCount1 = " + count.getCount());
//        count.countDown();
//        System.out.println("main getCount2 = " + count.getCount());
//        count.countDown();
//        System.out.println("main getCount3 = " + count.getCount());
//        count.countDown();
//        System.out.println("main getCount4 = " + count.getCount());
//        count.countDown();
//        System.out.println("main getCount5 = " + count.getCount());
//        count.countDown();
//        System.out.println("main getCount6 = " + count.getCount());

        CyclicBarrier cyclicBarrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("都到了！");
            }
        });

        MyThread[] threads = new MyThread[10];
        for (int i = 0; i < 10; i ++) {
            threads[i] = new MyThread(cyclicBarrier);
        }

        for (int i = 0; i < 10; i ++) {
            threads[i].start();
        }
    }
}
