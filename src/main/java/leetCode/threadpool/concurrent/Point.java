package leetCode.threadpool.concurrent;

import jdk.nashorn.internal.ir.annotations.Immutable;

/**
 * 不可变point类
 *
 * @author Dave
 * @create 2018-01-19 8:03 PM
 **/
@Immutable
public class Point {
    public final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
