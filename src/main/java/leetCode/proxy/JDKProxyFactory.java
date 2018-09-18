package leetCode.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 *
 * @author Dave
 * @create 2017-11-15 11:46
 **/

public class JDKProxyFactory {

    private Object target;

    public JDKProxyFactory(Object target) {
        this.target = target;
    }

    public Object newInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("this is jdkProxy start!");
                        Object returnValue = method.invoke(target, args);
                        System.out.println("this is jdkProxy end!");
                        return returnValue;
                    }
                });
    }

    public static void main(String[] args) {
        IDemoDao iDemoDao = new IDemoDao();
        DemoDao demoDao = (DemoDao) new JDKProxyFactory(iDemoDao).newInstance();
        demoDao.save();
    }
}
