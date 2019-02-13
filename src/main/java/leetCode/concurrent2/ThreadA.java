package leetCode.concurrent2;

import java.util.concurrent.Exchanger;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @ClassName ThreadA
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/29 21:20
 * @Version 1.0
 **/
public class ThreadA extends Thread {

    private Exchanger<String> exchanger;

    public ThreadA(Exchanger<String> exchanger) {
        super();
        this.exchanger = exchanger;
    }
    @Override
    public void run() {
        try {
            System.out.println("在线程A中得到线程B的值：" + exchanger.exchange("中国人A", 5, TimeUnit.SECONDS));
            System.out.println("A end!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        }
    }
}
