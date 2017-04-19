package leetCode;

/**
 * 静态工厂:产生的对象都是同一个对象
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
