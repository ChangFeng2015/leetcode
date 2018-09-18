package leetCode.singleton;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 14:19
 */
public class SingleTest {

    private static void servicePrint(Singleton singleton){
        singleton.print();
    }

    public static void main(final String[] args){
        Singleton1 singleton1 = Singleton1.getINSTANCE();
        servicePrint(singleton1);

        Singleton2 singleton2 = Singleton2.INSTANCE;
        singleton2.print();

        Singleton3 singleton3 = Singleton3.getINSTANCE();
        servicePrint(singleton3);
    }

}
