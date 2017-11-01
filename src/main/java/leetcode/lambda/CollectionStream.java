package leetcode.lambda;

import java.util.Collection;
import java.util.HashSet;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/18 14:56
 */
public class CollectionStream {
    public static void main(String[] args){
        Collection books = new HashSet();
        books.add("light java ee apllication action!");
        books.add("fuck java!");
        books.add("Andriod java");

        System.out.println(books.stream().filter(ele -> ((String)ele).contains("fuck")).count());
        System.out.println(books.stream().filter(ele -> ((String)ele).contains("java")).count());
        System.out.println(books.stream().filter(ele -> ((String)ele).length() > 10).count());
        books.stream().mapToInt(ele -> ((String)ele).length()).forEach(System.out::println);
    }
}
