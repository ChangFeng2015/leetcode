package leetCode.threadpool;

public class ThreadPoolManager {

    private static final ThreadPoolManager manager = new ThreadPoolManager();

    private ThreadPoolManager() {

    }

    public static ThreadPoolManager getInstance() {
        return manager;
    }
    //
    private static final int SIZE_CORE_POOL = 3;


}
