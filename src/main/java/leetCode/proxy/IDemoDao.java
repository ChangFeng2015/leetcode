package leetCode.proxy;

/**
 * 被代理的对象类
 *
 * @author Dave
 * @create 2017-11-15 11:42
 **/

public class IDemoDao implements DemoDao {
    @Override
    public void save() {
        System.out.println("this is dmeo dao");
    }
}
