package leetCode.util;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName ResourceUtils
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/29 13:55
 * @Version 1.0
 **/
public abstract class ResourceUtils {

    public static final String CLASSPATH_URL_PREFIX = "classpath:";

    public static final String FILE_URL_PREFIX = "file";

    public static final String URL_PROTOCOL_FILE = "file";

    public static final String URL_PROTOCOL_JAR = "jar";

    public static final String URL_PROTOCOL_ZIP = "zip";

    public static final String URL_PROTOCOL_VFSZIP = "vfszip";

    public static final String URL_PROTOCOL_WSJAR = "wsjar";

    public static final String JAR_URL_SEPARATOR = "!/";

    public static boolean isUrl(String resourceLocation) {
        if (resourceLocation == null) {
            return false;
        }
        if (resourceLocation.startsWith(CLASSPATH_URL_PREFIX)) {
            return true;
        }
        try {
            new URL(resourceLocation);
            return true;
        } catch (MalformedURLException ex) {
            return false;
        }
    }

//    public static URL getURL(String resourceLocation) {
//        Assert.assertNotNull(resourceLocation, "resource location must not be null!");
//        if (resourceLocation.startsWith(CLASSPATH_URL_PREFIX)) {
//            String path = resourceLocation.substring()
//        }
//    }
}
