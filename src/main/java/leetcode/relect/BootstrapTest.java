package leetcode.relect;

import org.junit.Test;
import sun.misc.Launcher;

import java.net.URL;

/**
 * 测试类加载器
 *
 * @author Dave
 */

public class BootstrapTest {
    @Test
    public void testBootstrap() {
        URL[] urls = Launcher.getBootstrapClassPath().getURLs();
        for (URL url : urls) {
            System.out.println(url.toExternalForm());
        }
    }
}
