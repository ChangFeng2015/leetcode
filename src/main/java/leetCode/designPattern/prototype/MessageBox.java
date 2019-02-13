package leetCode.designPattern.prototype;

import leetCode.designPattern.prototype.framework.Product;

/**
 * @ClassName MessageBox
 * @Description TODO
 * @Author Dave
 * @Date 2018/11/12 15:10
 * @Version 1.0
 **/
public class MessageBox implements Product {

    private char c;

    public MessageBox(char c) {
        this.c = c;
    }

    @Override
    public void use(String s) {
        System.out.println();
        int length = s.getBytes().length;
        for (int i = 0; i < length+ 4 ; i ++) {
            System.out.print(c);
        }
        System.out.println();
        System.out.println(c + " " + s + " " + c);
        for (int i = 0; i < length + 4; i ++) {
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
