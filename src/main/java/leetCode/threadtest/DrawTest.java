package leetCode.threadtest;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/25 17:48
 */
public class DrawTest {
    public static void main(String[] args){
        Account acc = new Account("123",1000);
        new DrawThread("A",acc,800).start();
        new DrawThread("B",acc,8000).start();
    }
}
