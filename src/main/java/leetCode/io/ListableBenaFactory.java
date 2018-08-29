package leetCode.io;

import java.lang.annotation.Annotation;
import java.util.Map;

/**
 * @ClassName ListableBenaFactory
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/29 17:22
 * @Version 1.0
 **/
public interface ListableBenaFactory extends BeanFactory {

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount();

    String[] getBeanDefinitionNames();

    String[] getBeanNamesForType(Class<?> type);

    String[] getBeanNamesForType(Class<?> type, boolean includeNonSingleton, boolean allowEagerInit);

    <T> Map<String, T> getBeansOfType(Class<T> type);

    <T> Map<String, T> getBeansOfType(Class<T> type, boolean includeNonSingleton, boolean allowEagerInit);

    String[] getBeanNamesForAnnotation(Class<? extends Annotation> annotationType);

    Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType);

    <A extends Annotation> A findAnnotationOnBean(String beanName, Class<A> annotationType);
}
