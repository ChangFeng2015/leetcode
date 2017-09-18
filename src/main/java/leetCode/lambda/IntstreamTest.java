package leetCode.lambda;

import java.util.stream.IntStream;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/18 14:46
 */
public class IntstreamTest {

    public static void main(String[] args){
        IntStream is = IntStream.builder().add(20).add(13).add(-2).add(18).build();
//        System.out.println("is max:" + is.max().getAsInt());
//        System.out.println("is min:" + is.min().getAsInt());
//        System.out.println("is sum:" + is.sum());
//        System.out.println("is counter:" + is.count());
        System.out.println("is average:" + is.average().getAsDouble());
    }
}
