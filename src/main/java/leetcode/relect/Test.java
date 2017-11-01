package leetcode.relect;

import org.junit.Assert;

public class Test {

   public static void main(String[] args) {
       Test1 test2 = new Test1();
//       System.out.println(test2.getClass().getField("field1"));
   }

}


class Test1 {
    private static Test1 test1 = new Test1();
    public static int field1;
    public static int field2 = 0;

    public Test1() {
        ++ field1;
        ++ field2;
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