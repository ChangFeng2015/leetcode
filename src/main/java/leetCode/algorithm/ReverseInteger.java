package leetCode.algorithm;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName ReverseInteger
 * @Description Reverse Integer
 * @Author Dave
 * @Date 2019/2/13 11:21
 * @Version 1.0
 **/
public class ReverseInteger {
    public int reverse(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    @Test
    public void test() {
        Assert.assertEquals(21, reverse(12));
        Assert.assertEquals(321, reverse(123));
        Assert.assertEquals(-321, reverse(-123));
    }
}
