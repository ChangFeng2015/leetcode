package leetcode.threadpool.concurrent;

/**
 * 不可变容器对象的volatile类型引用以缓存
 *
 * @author Dave
 * @create 2018-01-18 11:06 PM
 **/

public class VolatileCachedFactorizer {
}

class Holder {
    private int n;

    public Holder(int n) {
        this.n = n;
    }

    public void assertSanity() {
        if (n != n) {
            throw new AssertionError("This statement is false");
        }
    }
}
