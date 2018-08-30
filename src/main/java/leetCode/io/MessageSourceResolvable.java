package leetCode.io;

/**
 * @ClassName MessageSourceResolvable
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/30 10:14
 * @Version 1.0
 **/
public interface MessageSourceResolvable {

    String[] getCodes();

    Object[] getArguments();

    String getDefaultMessage();
}
