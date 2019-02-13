package leetCode.concurrent2;

/**
 * @ClassName Printer
 * @Description TODO
 * @Author Dave
 * @Date 2018/11/16 16:30
 * @Version 1.0
 **/
public class Printer implements Runnable {

    private String message;

    public Printer(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i ++) {
            System.out.print(message);
        }
    }
}
