package leetCode.designPattern.adapter;

/**
 * @ClassName PrinterBanner2
 * @Description 对象适配器--适配器
 * @Author Dave
 * @Date 2018/9/26 11:20
 * @Version 1.0
 **/
public class PrinterBanner2 extends Printer2 {

    private Banner banner;

    public PrinterBanner2(String name) {
        this.banner = new Banner(name);
    }

    @Override
    void printWeak() {
        banner.showWithParen();
    }

    @Override
    void printStrong() {
        banner.showWithAster();
    }
}
