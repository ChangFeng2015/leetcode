package leetCode.ThreadTest2;

/**
 * @ClassName ThreadLocalTest
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/5 15:39
 * @Version 1.0
 **/
public class ThreadLocalTest {

    public static ThreadLocal<Integer> threadLocal = new InheritableThreadLocal<>();

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("MyThread = " + threadLocal.get());
        }
    }

    public static void main(String[] args) {
        threadLocal.set(new Integer(123));

        Thread thread = new MyThread();
        thread.start();

        Thread thread1 = new MyThread();
        thread1.start();

        System.out.println("main = " + threadLocal.get());
    }

}
