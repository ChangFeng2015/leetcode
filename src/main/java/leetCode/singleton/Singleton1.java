package leetCode.singleton;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 14:01
 */
public class Singleton1 implements Singleton{

    private static Singleton1 INSTANCE;

    private Singleton1(){}

    public static Singleton1 getINSTANCE(){
        if(INSTANCE == null){
            INSTANCE = new Singleton1();
        }
        return INSTANCE;
    }

    public void print() {
        System.out.println("This is Singleton1's instance!");
    }
}
