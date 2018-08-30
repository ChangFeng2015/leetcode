package leetCode.io;

import leetCode.context.ApplicationEventPublisher;

/**
 * @ClassName ApplicationContext
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/29 15:48
 * @Version 1.0
 **/
public interface ApplicationContext extends ResourcePatternResolver, EnvironmentCapable, ListableBenaFactory, HierarchicalBeanFactory, MessageSource, ApplicationEventPublisher {
    String getId();

    String getApplicationName();

    String getDisplayName();

    long getStartupDate();

    ApplicationContext getParent();

}
