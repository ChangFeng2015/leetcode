package leetCode.test;

/**
 * Created by Dave on 2017/6/26.
 */
public class Bike7 {
    int speed;

    Bike7(){
        System.out.println("speed is " + speed);
    }

    {
        speed = 100;
    }

    public static void main(String[] args) {
        Bike7 b1 = new Bike7();
        Bike7 b2 = new Bike7();
    }
}
