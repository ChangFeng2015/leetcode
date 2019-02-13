package leetCode.designPattern.prototype;

import leetCode.designPattern.prototype.framework.Product;

/**
 * @ClassName UnderLinePen
 * @Description TODO
 * @Author Dave
 * @Date 2018/11/12 15:17
 * @Version 1.0
 **/
public class UnderLinePen implements Product {

    private char c;

    public UnderLinePen(char c) {
        this.c = c;
    }

    @Override
    public void use(String s) {
        System.out.println();
        int length = s.getBytes().length;
        System.out.println(s);
        System.out.println();
        for (int i = 0; i < length; i ++) {
            System.out.print(c);
        }
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
