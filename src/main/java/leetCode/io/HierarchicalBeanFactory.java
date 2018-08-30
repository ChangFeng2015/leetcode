package leetCode.io;

/**
 * @ClassName HierarchicalBeanFactory
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/30 9:57
 * @Version 1.0
 **/
public interface HierarchicalBeanFactory extends BeanFactory {

    BeanFactory getParentBeanFactory();

    boolean containsLocalBean(String name);
}
