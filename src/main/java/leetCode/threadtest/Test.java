package leetCode.threadtest;

public class Test {



    void exchange(String s, char[] chars){
        s = "def";
        chars[2] = 'e';
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
//        Test test = Test.class.newInstance();
//        String a = "abc";
//        char[] b = {'a', 'b', 'c'};
//        test.exchange(a,b);
//        System.out.println(a);
//        System.out.println(b);
        int number = 10;
        System.out.println(Integer.toBinaryString(number) + " : " + number);
        number = number >>> 1;
        System.out.println(Integer.toBinaryString(number) + " : " + number);
        number = number << 2;
        System.out.println(Integer.toBinaryString(number) + " : " + number);
    }
}
