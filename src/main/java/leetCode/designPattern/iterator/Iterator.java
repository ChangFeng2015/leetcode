package leetCode.designPattern.iterator;

/**
 * @ClassName Iterator
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/23 11:51
 * @Version 1.0
 **/
public interface Iterator<E> {
    E next();
    boolean hasNext();
}
