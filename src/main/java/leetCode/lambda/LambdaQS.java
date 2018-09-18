package leetCode.lambda;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 16:03
 */
interface Eatable{
    void taste();
}

interface Flyable{
    void fly(String weather);
}

interface Addable{
    int add(int a,int b);
}

public class LambdaQS {
    Runnable r = () -> {
        for(int i = 0; i < 100; i ++){
            System.out.println(i);
        }
    };
}
