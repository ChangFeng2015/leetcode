package leetCode.io;

/**
 * @ClassName BeanFactory
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/29 17:04
 * @Version 1.0
 **/
public interface BeanFactory {

    String FACTORY_BEAN_PREFIX = "&";

    Object getBean(String name);

    <T> T getBean(String name, Class<T> requiredType);

    <T> T getBean(Class<T> requiredType);

    Object getBean(String name, Object... args);

    boolean containsBean(String name);

    boolean isSingleton(String name);

    boolean isPrototype(String name);

    boolean isTypeMatch(String name, Class<?> targetType);

    Class<?> getType(String name);

    String[] getAliases(String name);
}
