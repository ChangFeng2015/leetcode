package leetCode.designPattern.builder;

/**
 * @ClassName Builder
 * @Description TODO
 * @Author Dave
 * @Date 2018/11/12 16:08
 * @Version 1.0
 **/
public abstract class Builder {

    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();

}
