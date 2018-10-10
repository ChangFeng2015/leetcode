package leetCode.designPattern.adapter;

/**
 * @ClassName PrintBanner
 * @Description 类适配器模式--适配器
 * @Author Dave
 * @Date 2018/9/26 11:00
 * @Version 1.0
 **/
public class PrintBanner extends Banner implements Printer {

    public PrintBanner(String name) {
        super(name);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
