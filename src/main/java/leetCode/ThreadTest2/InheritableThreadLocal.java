package leetCode.ThreadTest2;

/**
 * @ClassName InheritableThreadLocal
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/5 15:46
 * @Version 1.0
 **/
public class InheritableThreadLocal<T> extends java.lang.ThreadLocal<T> {

    protected T childValue(T parentValue) {
        return parentValue;
    }

}
