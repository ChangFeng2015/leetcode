package leetCode.factory;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 15:12
 */
public class FactoryTest {

    public static void consumerService(MachineFactory factory){
        Vehicle vehicle = (Vehicle)factory.getService();
        vehicle.driving();
        vehicle.moves();
    }

    public static void main(String[] args){
        BicycleFactory bicycleFactory = new BicycleFactory();
        consumerService(bicycleFactory);

        CarFactory carFactory = new CarFactory();
        consumerService(carFactory);
    }

}
