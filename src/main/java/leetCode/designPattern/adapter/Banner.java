package leetCode.designPattern.adapter;

/**
 * @ClassName Banner
 * @Description 类适配器模式--实际情况
 * @Author Dave
 * @Date 2018/9/26 10:56
 * @Version 1.0
 **/
public class Banner {

    private String name;

    public Banner(String name) {
        this.name = name;
    }

    public void showWithParen() {
        System.out.println("(" + name + ")");
    }

    public void showWithAster() {
        System.out.println("*" + name + "*");
    }
}
