package leetcode.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理
 *
 * @author Dave
 * @create 2017-11-15 12:21
 **/

public class CglibProxyFactory implements MethodInterceptor{

    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("this cglibProxy start...");
        Object returnValue = method.invoke(target, objects);
        System.out.println("this cglibProxy end....");
        return returnValue;
    }

    public static void main(String[] args) {
        CglibDemoDao cglibDemoDao = new CglibDemoDao();
        CglibDemoDao proxy = (CglibDemoDao) new CglibProxyFactory(cglibDemoDao).getProxyInstance();
        proxy.save();
    }
}
