package leetCode.concurrent2;

/**
 * @ClassName Run
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/29 21:26
 * @Version 1.0
 **/
public class Run {
    public static void main(String[] args) throws InterruptedException {
       for (int i = 0; i < 10; i ++) {
           System.out.println("Good!");
           Thread.sleep(1000);
       }
    }
}
