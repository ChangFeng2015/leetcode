package leetCode.designPattern.factory;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 15:02
 */
public class Bicycle implements Vehicle{

    private static final int DRIVER = 1;
    private static final int WHEEL = 2;

    public void driving() {
        System.out.println("Bicycle need " + DRIVER + " driver!");
    }

    public void moves() {
        System.out.println("Bicycle has " + WHEEL + " wheels!");
    }
}
