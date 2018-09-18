package leetCode.function;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 20:14
 */
public class FunctionTest {
    public static void main(String[] args){
        Converter converter = from -> Integer.valueOf(from);
        Integer val = converter.convert("89");
        Converter converter1 = Integer::valueOf;
        val = converter1.convert("67");
        System.out.println(val);
    }
}
