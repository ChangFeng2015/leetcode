package leetCode.io;

import java.io.IOException;

/**
 * @ClassName ResourcePatternResolver
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/29 15:29
 * @Version 1.0
 **/
public interface ResourcePatternResolver extends ResourceLoader {

    String CLASSPATH_ALL_URL_PREFIX = "classpath*:";

    Resource[] getResources(String locationPattern) throws IOException;

}
