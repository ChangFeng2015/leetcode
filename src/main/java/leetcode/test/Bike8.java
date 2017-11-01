package leetcode.test;

/**
 * Created by Dave on 2017/6/26.
 */
public class Bike8 {
    int speed;

    Bike8(){
        System.out.println("construct is invoke!");
    }

    {
        System.out.println("instance initializer blocker invoked!");
    }

    public static void main(String[] args) {
        Bike8 b1 = new Bike8();
        Bike8 b2 = new Bike8();
    }
}
