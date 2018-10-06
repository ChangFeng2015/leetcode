package leetCode.designPattern.factory;

import leetCode.designPattern.factory.framework.Factory;
import leetCode.designPattern.factory.framework.Product;
import leetCode.designPattern.factory.idcard.IDCardFactory;
import org.junit.Test;

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

    @Test
    public void idCardTest() {
        Factory factory = new IDCardFactory();
        Product p1 = factory.create("小明");
        Product p2 = factory.create("小刚");
        Product p3 = factory.create("小憨狗");
        p1.use();
        p2.use();
        p3.use();
        System.out.println(((IDCardFactory) factory).getOwners());
    }
}
