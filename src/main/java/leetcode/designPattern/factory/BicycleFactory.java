package leetcode.designPattern.factory;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 15:11
 */
public class BicycleFactory implements MachineFactory{
    public Machine getService() {
        return new Bicycle();
    }
}
