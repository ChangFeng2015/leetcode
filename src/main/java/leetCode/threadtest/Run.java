package leetCode.threadtest;

/**
 * @ClassName Run
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/18 17:00
 * @Version 1.0
 **/
public class Run {

    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();
        MyThread[] tArray = new MyThread[10];

        for (int i = 0; i < tArray.length; i ++) {
            tArray[i] = new MyThread(service);
            tArray[i].setName("线程 : " + (i + 1));
            tArray[i].start();
        }

        Thread.sleep(2000);
        service.downMethod();
    }
}
