package leetcode.threadtest;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/25 11:35
 */
public class InvokeRun extends Thread{
    private int i;
    public void run(){
        for(;i < 100; i ++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args){
        for(int i = 0;i < 100; i ++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            if(i == 20){
                new InvokeRun().run();
                new InvokeRun().run();
            }
        }
    }
}
