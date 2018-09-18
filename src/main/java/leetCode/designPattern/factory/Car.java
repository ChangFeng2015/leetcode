package leetCode.designPattern.factory;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 15:07
 */
public class Car implements Vehicle{

    private static final int DRIVER = 1;
    private static final int WHEEL = 4;

    public void driving() {
        System.out.println("Car needs " + DRIVER + " dirver!");
    }

    public void moves() {
        System.out.println("Car has " + WHEEL + " wheels!");
    }
}
