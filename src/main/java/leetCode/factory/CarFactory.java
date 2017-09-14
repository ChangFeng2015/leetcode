package leetCode.factory;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 15:11
 */
public class CarFactory implements MachineFactory{
    public Machine getService() {
        return new Car();
    }
}
