package leetCode.designPattern.proxy;

/**
 * @ClassName PrinterProxy
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/15 15:21
 * @Version 1.0
 **/
public class PrinterProxy implements Printable {

    private String name;
    private Printer real;

    public PrinterProxy() {}

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
