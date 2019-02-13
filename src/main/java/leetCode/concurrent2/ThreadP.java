package leetCode.concurrent2;

/**
 * @ClassName ThreadP
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/30 16:55
 * @Version 1.0
 **/
public class ThreadP extends Thread {

    private RepastService service;

    public ThreadP(RepastService service) {
        this.service = service;
    }

    @Override
    public void run() {
        service.set();
    }
}
