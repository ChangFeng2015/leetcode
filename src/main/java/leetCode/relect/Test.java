package leetCode.relect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {
        Test1 test2 = new Test1();
//       System.out.println(test2.getClass().getField("field1"));
    }

    @org.junit.Test
    public void initByDefaultConst() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Class clazz = loader.loadClass("leetCode.relect.Car");

        Constructor constructor = clazz.getDeclaredConstructor((Class[]) null);
        Car car = (Car) constructor.newInstance();

        Method setBrand = clazz.getMethod("setBrand", String.class);
        setBrand.invoke(car, "benz");

        Method setColor = clazz.getMethod("setColor", String.class);
        setColor.invoke(car, "red");

        Method setMaxSpeed = clazz.getMethod("setMaxSpeed", int.class);
        setMaxSpeed.invoke(car, 230);

        Method introduce = clazz.getMethod("introduce");
        introduce.invoke(car, null);
    }

}


class Test1 {
    private static Test1 test1 = new Test1();
    public static int field1;
    public static int field2 = 0;

    public Test1() {
        ++field1;
        ++field2;
    }

    public static int getField1() {
        return field1;
    }

    public static void setField1(int field1) {
        Test1.field1 = field1;
    }

    public static int getField2() {
        return field2;
    }

    public static void setField2(int field2) {
        Test1.field2 = field2;
    }
}