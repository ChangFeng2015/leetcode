package leetCode.function;

/**
 * @ClassName PersonFactory
 * @Description TODO
 * @Author Dave
 * @Date 2019/2/20 17:35
 * @Version 1.0
 **/
public interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}
