package leetCode.test;

/**
 * Created by Dave on 2017/5/17.
 */
public class Testarray4 {
    public static void main(String[] args) {
        int arr[] = {4,4,5};

        Class c = arr.getClass();
        String name = c.getName();

        System.out.println(name);

        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo));
    }
}
