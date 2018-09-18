package leetCode.designPattern.state;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/12 17:16
 */
public class Context {
    //define the lift status
    public static final OpenningState OPENNING_STATE = new OpenningState();
    public static final RunningState RUNNING_STATE = new RunningState();
    public static final StoppingState STOPPING_STATE = new StoppingState();
    public static final ClosingState CLOSING_STATE = new ClosingState();

    private LiftState liftState;

    public LiftState getLiftState(){
        return liftState;
    }

    public void setLiftState(LiftState liftState){
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    public void open(){
        this.liftState.open();
    }

    public void close(){
        this.liftState.close();
    }

    public void stop(){
        this.liftState.stop();
    }

    public void run(){
        this.liftState.run();
    }
}
