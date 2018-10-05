package leetCode.designPattern.template;

import org.junit.Test;

public class DisplayTest {
    @Test
    public void test() {
        AbstractDisplay charDisplay = new CharDisplay('A');
        charDisplay.display();
        AbstractDisplay stringDisplay = new StringDisplay("Hello, template method!");
        stringDisplay.display();
    }
}
