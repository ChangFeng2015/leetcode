package leetCode;

import java.util.Locale;

/**
 * Created by Dave on 2016/11/13.
 */
public class Demo {
    public static void main(String[] args){
        String a = "abcd";
        String b = "abcd";

        StringBuffer sb = new StringBuffer(a);
        boolean c = a.contentEquals(b);
        b = a.toUpperCase(Locale.CHINA);
        boolean d = b.contentEquals(sb);

        char[] e = {'a','b','c','d','e','f'};
        String f = String.copyValueOf(e,2,3);
        a.equals(b);

    }
}
