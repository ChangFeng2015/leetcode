package leetcode.algorithm;

import java.util.Arrays;

public class QKSort {

    /**
     * 交换数组中第i个元素和第j个元素
     *
     * @param a
     * @param i
     * @param j
     * @return 交换后的数组
     */
    public static long[] getSwap(long[] a, int i, int j) {
        a[i] = a[i] ^ a[j];
        a[j] = a[i] ^ a[j];
        a[i] = a[i] ^ a[j];

        return a;
    }

    public static void main(String[] args) {
        long[] a = new long[]{2L, 3L, 1L, 5L};
        a = getSwap(a, 0, 2);
        System.out.println(Arrays.toString(a));
    }
}
