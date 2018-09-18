package leetCode.lambda;

import java.util.Collection;
import java.util.HashSet;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/18 13:55
 */
public class CollectionEach {
    public static void main(String[] args){
        Collection books = new HashSet();
        books.add("light java ee apllication action!");
        books.add("fuck java!");
        books.add("Andriod java");

        books.forEach(obj -> System.out.println("this element is " + obj));
    }
}
