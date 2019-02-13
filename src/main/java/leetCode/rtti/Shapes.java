package leetCode.rtti;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Shapes
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/12 10:07
 * @Version 1.0
 **/
public class Shapes {

    @Test
    public void test() {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList) {
            shape.draw();
        }
    }

    @Test
    public void sweetShop() {
        System.out.println("inside main");
        new Candy();
        System.out.println("After creating Candy");
        try {
            Class.forName("leetCode.rtti.Gum");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After Class.forName(\"Gum\")");
        new Cookie();
        System.out.println("After creating cookie");
    }
}

class Candy{
    static {
        System.out.println("Loading candy");
    }
}

class Cookie {
    static {
        System.out.println("Loading cookie");
    }
}

class Gum {
    static {
        System.out.println("Loading Gum");
    }
}


