package leetCode;

/**
 * 静态工厂
 * Created by Dave on 2017/4/19.
 */
public class Elvis {
    private static final Elvis INSTANCE = new Elvis();
    private Elvis(){

    }
    public static Elvis getInstance(){
        return INSTANCE;
    }

}
