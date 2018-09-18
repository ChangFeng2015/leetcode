package leetCode.threadtest;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/25 14:46
 */
public class JoinThread extends Thread {

    public JoinThread(String name){
        super(name);
    }

    public void run(){
        for(int i = 0; i < 100; i ++){
            System.out.println(getName() + " " + i);
        }
    }

    public static void main(String[] args) throws Exception{
        new JoinThread("new Thread").start();
        for(int i = 0; i < 100; i ++){
            if(i == 20){
                JoinThread jt = new JoinThread("join thread");
                jt.start();
                jt.join();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }

    }
}
