package leetcode.threadtest;

public class Test {



    void exchange(String s, char[] chars){
        s = "def";
        chars[2] = 'e';
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Test test = Test.class.newInstance();
        String a = "abc";
        char[] b = {'a', 'b', 'c'};
        test.exchange(a,b);
        System.out.println(a);
        System.out.println(b);
    }
}
