package leetCode.designPattern.responsibilitychain;

import org.junit.Test;

/**
 * @author : Dave
 * @date : 2017/11/24
 */
public class Client {

    @Test
    public void reposityChainTest() {
        ConcreteHandler firstHandler = new ConcreteHandler();
        ConcreteHandler secondHandler = new ConcreteHandler();

        firstHandler.setSuccessor(secondHandler);
        firstHandler.handleRequest();
    }
}
