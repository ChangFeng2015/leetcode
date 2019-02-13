package leetCode.concurrent2;

import java.util.concurrent.Exchanger;

/**
 * @ClassName ThreadB
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/29 21:22
 * @Version 1.0
 **/
public class ThreadB extends Thread {

    private Exchanger<String> exchanger = new Exchanger<>();

    public ThreadB(Exchanger exchanger) {
        super();
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("在线程B中得到线程A:" + exchanger.exchange("中国人b"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
