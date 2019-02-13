package leetCode.designPattern.proxy;

/**
 * @ClassName Printable
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/15 15:11
 * @Version 1.0
 **/
public interface Printable {
    void setPrinterName(String name);
    String getPrinterName();
    void print(String string);
}
