package leetcode.test;

/**
 * Created by Dave on 2017/5/17.
 */
public interface Drawable {
    void draw();

    default void msg(){
        System.out.println("drawing is created!");
    }

    static int cube(int x){
        return x * x * x;
    }
}
