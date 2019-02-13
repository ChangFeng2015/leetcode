package leetCode.rtti;

/**
 * @ClassName Shape
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/12 10:02
 * @Version 1.0
 **/
public abstract class Shape {

    public void draw () {
        System.out.println(this + " draw()!");
    }

    @Override
    public abstract String toString();
}
