package leetCode.io;

import leetCode.util.ResourceUtils;

/**
 * @ClassName ResourceLoader
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/29 10:50
 * @Version 1.0
 **/
public interface ResourceLoader {

    String CLASSPATH_URL_PREFIX = ResourceUtils.CLASSPATH_URL_PREFIX;

    Resource getResource(String location);

    ClassLoader getClassLoader();

}
