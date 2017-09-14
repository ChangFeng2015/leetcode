package leetCode.singleton;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 14:12
 */
public class Singleton3 implements Singleton{

    private Singleton3(){

    }

    public void print() {
        System.out.println("This is Singleton3's instance!");
    }

    private static class SingletonHolder{
        private static final Singleton3 INSTANCE = new Singleton3();
    }

    public static final Singleton3 getINSTANCE(){
        return SingletonHolder.INSTANCE;
    }
}
