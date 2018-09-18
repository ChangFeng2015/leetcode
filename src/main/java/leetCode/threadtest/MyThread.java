package leetCode.threadtest;

/**
 * @ClassName MyThread
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/18 16:59
 * @Version 1.0
 **/
public class MyThread extends Thread {

    private MyService service;

    public MyThread(MyService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
