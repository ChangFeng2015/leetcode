package leetcode.threadpool.concurrent;

/**
 * 七周七并发模型学习
 * @author Dave
 */

public class HelloWorld {

    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread() {

            @Override
            public void run() {
                System.out.println("Hello from new thread!");
            }

        };

        myThread.start();
        Thread.yield();
        System.out.println("Hello from main thread!");
        myThread.join();
    }
}
