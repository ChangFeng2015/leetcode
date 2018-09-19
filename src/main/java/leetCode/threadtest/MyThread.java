package leetCode.threadtest;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/18 16:59
 * @Version 1.0
 **/
public class MyThread extends Thread {

    private CyclicBarrier cbRef;

    public MyThread(CyclicBarrier cbRef) {
        super();
        this.cbRef = cbRef;
    }

//    private MyService service;
//
//    public MyThread(MyService service) {
//        super();
//        this.service = service;
//    }

//    private CountDownLatch comingTag;
//    private CountDownLatch waitTag;
//    private CountDownLatch waitRunTag;
//    private CountDownLatch beginTag;
//    private CountDownLatch endTag;

//    public MyThread(CountDownLatch comingTag, CountDownLatch waitTag, CountDownLatch waitRunTag, CountDownLatch beginTag, CountDownLatch endTag) {
//        this.comingTag = comingTag;
//        this.waitTag = waitTag;
//        this.waitRunTag = waitRunTag;
//        this.beginTag = beginTag;
//        this.endTag = endTag;
//    }


    @Override
    public void run() {
//        try {
//            System.out.println("运动员正使用不同的交通工具往起点赶来！");
//            Thread.sleep((int) (Math.random() * 10000));
//            System.out.println(Thread.currentThread().getName() + " 到达起点！");
//            comingTag.countDown();
//            System.out.println("等待裁判说准备");
//            waitTag.countDown();
//            System.out.println("各就各位，准备起跑姿势！");
//            Thread.sleep((int) (Math.random() * 10000));
//            waitRunTag.countDown();
//            beginTag.await();
//            System.out.println(Thread.currentThread().getName() + "运动员起跑，并且跑步用时不确定！");
//            Thread.sleep((int) (Math.random() * 10000));
//            endTag.countDown();
//            System.out.println(Thread.currentThread().getName() + "到达终点！");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        service.testMethod();
        try {
            Thread.sleep((int)(Math.random() * 10000));
            System.out.println(Thread.currentThread().getName() + "到了！" + System.currentTimeMillis());
            cbRef.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }


    }
}
