package leetcode.threadtest;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/25 10:53
 */
public class ThirdThread {
    public static void main(String[] args){
        ThirdThread rt = new ThirdThread();
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)() -> {
            int i = 0;
            for(; i < 100; i ++){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
            return i;
        });

        for(int i = 0; i < 100; i ++){
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 20){
                new Thread(task,"this a thread which has return").start();
            }
        }
        try{
            System.out.println("sub thread's return : " + task.get());
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
