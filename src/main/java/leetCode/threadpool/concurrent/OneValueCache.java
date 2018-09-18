package leetCode.threadpool.concurrent;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * 并发编程实战学习--因式分解缓存不可变类
 * 1.类添加final修饰符,保证类不被继承
 * 2.保证所有成员变量必须私有,比企鹅加上fianl修饰
 * 3.不提供改变成员变量的方法,包括setter
 * 4.通过构造器初始化所有成员,进行深拷贝(deep copy);
 * 5.在getter方法中,不要直接返回对象本身,而是克隆对象,并返回对象的拷贝
 *
 * @author Dave
 * @create 2018-01-18 10:44 PM
 **/
@Immutable //不可变类注释
public final class OneValueCache {

    private final BigInteger lastNumber;
    private final BigInteger[] lastFactors;

    public OneValueCache(BigInteger i, BigInteger[] factors) {
        lastNumber = i;
        // 此处必须进行深度拷贝, lastFactors = factors是不可以的,不能保证不可变性
        lastFactors = Arrays.copyOf(factors, factors.length);
    }

    public BigInteger[] getFactors(BigInteger i) {
        if (lastNumber == null || !lastNumber.equals(i)) {
            return null;
        } else {
            // get方法返回值需要对对象进行拷贝
            return Arrays.copyOf(lastFactors, lastFactors.length);
        }
    }
}
