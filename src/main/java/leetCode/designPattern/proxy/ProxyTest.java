package leetCode.designPattern.proxy;

import org.junit.Test;

/**
 * @ClassName ProxyTest
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/15 15:25
 * @Version 1.0
 **/
public class ProxyTest {

    @Test
    public void test() {
        Printable p = new PrinterProxy("Alice");
        System.out.println("现在的名字是：" + p.getPrinterName() + ".");
        p.setPrinterName("Jim");
        System.out.println("现在的名字是：" + p.getPrinterName() + ".");
        p.print("hello, proxy");
    }
}
