package leetcode.threadtest;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/25 16:35
 */
public class PriorityTest extends Thread {
    public PriorityTest(String name){
        super(name);
    }

    public void run(){
        for(int i = 0; i < 50; i ++){
            System.out.println(getName() + "'s ppriority " + getPriority() + " -- " + i);
        }
    }

    public static void main(String[] args){
        Thread.currentThread().setPriority(6);
        for(int i = 0; i < 30; i ++){
            if(i == 10){
                PriorityTest low = new PriorityTest("low level");
                low.start();
                System.out.println("low level thread's priority is " + low.getPriority());
                low.setPriority(Thread.MIN_PRIORITY);
            }
            if(i == 20){
                PriorityTest high = new PriorityTest("super");
                high.start();
                System.out.println("super level thread's priority is " + high.getPriority());
                high.setPriority(Thread.MAX_PRIORITY);
            }
        }
    }
}
