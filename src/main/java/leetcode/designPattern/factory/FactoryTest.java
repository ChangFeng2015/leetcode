package leetcode.designPattern.factory;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 15:12
 */
public class FactoryTest {

    public static void consumerService(MachineFactory factory){
        Machine machine = factory.getService();
        Vehicle vehicle;
        if(machine instanceof Vehicle){
            System.out.println(machine.getClass() + " is a instance of Vehicle!");
            vehicle = (Vehicle)machine;
            vehicle.driving();
        }
        machine.moves();
    }

    public static void main(String[] args){
        BicycleFactory bicycleFactory = new BicycleFactory();
        consumerService(bicycleFactory);

        CarFactory carFactory = new CarFactory();
        consumerService(carFactory);
    }

}
