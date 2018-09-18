package leetCode.function;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 20:43
 */
public class SubstringTest {
    public static void main(String[] args){
//        String a = "Java I love you";
//        int b = 2,c = 5;
        Substring sb = (a,b,c) -> a.substring(b,c);
        String str = sb.test("Java I love you",2,5);
        Substring sb1 = String::substring;
        str = sb1.test("I am OK!",1,3);
        System.out.println(str);
    }
}
