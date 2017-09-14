package leetCode.designPattern.state;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/12 17:17
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context){
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
