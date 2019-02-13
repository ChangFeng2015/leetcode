package leetCode.concurrent2;

/**
 * @ClassName ThreadC
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/29 21:24
 * @Version 1.0
 **/
public class ThreadC extends Thread {

    private RepastService service;

    public ThreadC(RepastService service) {
        super();
        this.service = service;
    }

    @Override
    public void run() {
        service.get();
    }
}
