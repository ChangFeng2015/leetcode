package leetCode.guava;

import com.google.common.base.CharMatcher;
import com.google.common.base.Function;
import com.google.common.base.Predicate;

import java.util.ArrayList;

/**
 * @ClassName FunctionTest
 * @Description TODO
 * @Author Dave
 * @Date 2018/9/5 16:06
 * @Version 1.0
 **/
public class FunctionTest {

    public static void main(String[] args) {
        Function<String, Integer> lengthFunction = new Function<String, Integer>() {
            @Override
            public Integer apply(String input) {
                return input.length();
            }
        };

        Predicate<String> allCaps = new Predicate<String>() {
            @Override
            public boolean apply(String input) {
                return CharMatcher.JAVA_UPPER_CASE.matchesAllOf(input);
            }
        };


    }

    public static <T> ArrayList<T> repeat(int n, Class<T> cl) throws IllegalAccessException, InstantiationException {
        ArrayList<T> result = new ArrayList<>();
        for (int i = 0; i < n; i ++) {
            result.add(cl.newInstance());
        }
        return result;
    }

}
