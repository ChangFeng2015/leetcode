package leetCode.threadpool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Dave
 * @create 2017-11-13 21:05
 **/

public class ExceptionThread implements Runnable {

    @Override
    public void run() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {

//        ExecutorService service = Executors.newCachedThreadPool();
        //设置核心池大小
        int corePoolSize = 5;
        //设置线程池最大能接受多少线程
        int maximumPoolSize = 20;
        //当前线程数大于corePoolSize、小于maxPoolSize时，超出corePoolSize的线程数的生命周期
        long keepActiveTime = 200;
        //设置时间单位：秒
        TimeUnit timeUnit = TimeUnit.SECONDS;

        //设置线程池缓存队列的排队策略为FIFO,并且指定缓存队列大小为5
        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(5);

        //创建ThreadPoolExecutor线程池对象，并初始化该对象的各种参数
        ThreadPoolExecutor executor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepActiveTime, timeUnit, workQueue);

        for (int i = 0; i < 15; i ++) {
            MyTask myTask = new MyTask(i);
            executor.execute(myTask);
            System.out.println("线程池中线程数目：" + executor.getPoolSize()
                    + "队列中等待执行的任务数目：" + executor.getQueue().size()
                    + ",已执行完的任务的数目：" + executor.getCompletedTaskCount());
        }
        executor.shutdown();
    }
}

class MyTask implements Runnable {
    private int num;

    public MyTask(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("正在执行task " + num );
        try {
            Thread.currentThread();
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task " + num + "执行完毕");
    }

    /**
     * 获取（未来时间戳-当前时间戳）的差值，
     * 也即是：（每个线程的睡醒时间戳-每个线程的入睡时间戳）
     * 作用：用于实现多线程高并发
     * @return
     * @throws ParseException
     */
    public long getDelta() {
        //获取当前时间戳
        long t1 = System.currentTimeMillis();
        //获取未来某个时间戳（自定义，可写入配置文件）
        String str = "2016-11-11 15:15:15";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long t2 = 0;
        try {
            t2 = simpleDateFormat.parse(str).getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return t2 - t1;
    }
}