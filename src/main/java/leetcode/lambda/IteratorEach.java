package leetcode.lambda;

import java.util.Collection;
import java.util.HashSet;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/18 14:09
 */
public class IteratorEach {
    public static void main(String[] args){
        Collection books = new HashSet();
        books.add("java is a good progrming language!");
        books.add("javaScript is also a good programing language!");
        books.add("spring is a good Framework!");

//        Iterator it = books.iterator();
//        it.forEachRemaining(obj -> System.out.println("this element is " + obj));

        books.removeIf(ele -> ((String)ele).length() > 30);
        books.forEach(ele -> System.out.println("this element is " + ele));
    }
}
