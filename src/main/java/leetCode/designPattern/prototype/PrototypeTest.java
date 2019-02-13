package leetCode.designPattern.prototype;

import leetCode.designPattern.prototype.framework.Manager;
import leetCode.designPattern.prototype.framework.Product;
import org.junit.Test;

/**
 * @ClassName PrototypeTest
 * @Description TODO
 * @Author Dave
 * @Date 2018/11/4 14:16
 * @Version 1.0
 **/
public class PrototypeTest {

    @Test
    public void test() {
        String hello = "Hello, world.";
        Manager manager = new Manager();
        UnderLinePen upen = new UnderLinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warn box", mbox);
        manager.register("slash box", sbox);
        Product p1 = manager.create("strong message");
        p1.use(hello);
        Product p2 = manager.create("warn box");
        p2.use(hello);
        Product p3 = manager.create("slash box");
        p3.use(hello);
    }
}
