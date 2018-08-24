package leetCode.algorithm;

import org.apache.commons.lang3.math.NumberUtils;
import org.junit.Test;

/**
 * @ClassName MaxNumber
 * @Description 递归求解数组中最大的数
 * @Author Dave
 * @Date 2018/8/24 10:37
 * @Version 1.0
 **/
public class MaxNumber {
    public int getMax(int[] array, int i) {
        if (i == array.length - 1) {
            return array[i];
        }
        return Math.max(array[i], getMax(array, i + 1));
    }

    @Test
    public void test() {
        int[][] a = {{10, -9, 20}, {29, 12, 11, 30}};
        for (int[] array : a) {
            System.out.println(getMax(array, NumberUtils.INTEGER_ZERO));
        }
    }
}
