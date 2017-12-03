package leetCode.function;

public class LambdaAndInner {
    private int age = 12;
    private static String name = "疯狂英语";

    public void test(){
        String book = "疯狂英语讲义";
        Displayable dis = () -> {
            //访问effectively final的局部变量
            System.out.println("book 局部变量是：" + book);
            //访问外部类的实例和类变量
            System.out.println("外部类的age实例变量为：" + age);
            System.out.println("外部类的name类变量为：" + name);
        };
        dis.display();
        //调用dis对象从接口中继承add()方法
        System.out.println(dis.add(3,5));
    }
    public static void main(String[] args){
        LambdaAndInner lambda = new LambdaAndInner();
        lambda.test();
    }
}
