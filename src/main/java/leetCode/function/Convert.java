package leetCode.function;

/**
 * @ClassName Convert
 * @Description TODO
 * @Author Dave
 * @Date 2019/2/20 17:26
 * @Version 1.0
 **/
@FunctionalInterface
public interface Convert<F, T> {
    T convert(F from);
}
