package leetcode.lambda;

import java.util.Collection;
import java.util.HashSet;
import java.util.function.Predicate;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/18 14:26
 */
public class PredicateTest2 {

    public static void main(String[] args){
        Collection books = new HashSet();
        books.add("light java ee apllication action!");
        books.add("fuck java!");
        books.add("Andriod java");

        System.out.println(callAll(books,ele -> ((String)ele).contains("java")));
        System.out.println(callAll(books,ele -> ((String)ele).contains("fuck")));
        System.out.println(callAll(books,ele -> ((String)ele).length() > 10));
    }

    public static int callAll(Collection books,Predicate predicate){
        int total = 0;
        for(Object obj : books){
            if(predicate.test(obj)){
                total ++;
            }
        }
        return total;
    }
}
