package leetcode.test;

/**
 * Created by Dave on 2017/5/17.
 */
public class TestInterfaceDefault {
    public static void main(String[] args) {
        Drawable rectangle = new Rectangle();
        rectangle.msg();
        rectangle.draw();
        System.out.println(Drawable.cube(3));
    }
}
