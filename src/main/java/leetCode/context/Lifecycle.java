package leetCode.context;

/**
 * @ClassName Lifecycle
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/30 10:56
 * @Version 1.0
 **/
public interface Lifecycle {

    void start();

    void stop();

    boolean isRunning();
}
