package leetCode.threadtest;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/25 16:15
 */
public class YieldTest extends Thread {
    public YieldTest(String name){
        super(name);
    }

    public void run(){
        for(int i = 0; i < 50; i ++){
            System.out.println(getName() + " " + i);
            if(i == 20){
                Thread.yield();
            }
        }
    }

    public static void main(String[] args){
        YieldTest yt1 = new YieldTest("super");
        yt1.start();
        YieldTest yt2 = new YieldTest("low");
        yt2.start();
    }
}
