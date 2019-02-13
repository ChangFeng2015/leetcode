package leetCode.designPattern.prototype.framework;

/**
 * @ClassName Product
 * @Description TODO
 * @Author Dave
 * @Date 2018/11/12 15:03
 * @Version 1.0
 **/
public interface Product extends Cloneable {

    void use(String c);

    Product createClone();
}
