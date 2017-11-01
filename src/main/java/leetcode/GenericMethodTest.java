package leetcode;

import java.util.ArrayList;
import java.util.Collection;

public class GenericMethodTest {
    //声明一个泛型的方法，该泛型方法中带一个T类型参
    static <T> void fromArrayToCollection(T[] a, Collection<T> c){
        for(T o :a){
            c.add(o);
        }
    }

    public static void main(String[] args){
        Object[] oa = new Object[100];
        Collection<Object> collection = new ArrayList<Object>();
        fromArrayToCollection(oa,collection);

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<String>();
        fromArrayToCollection(sa,cs);
        fromArrayToCollection(sa,collection);

        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList<Number>();
        fromArrayToCollection(ia,cn);
        fromArrayToCollection(fa,cn);
        fromArrayToCollection(na,cn);
        fromArrayToCollection(na,collection);

    }

    static <T> void test(Collection<? extends T> from,Collection<T> to){
        for(T ele : from){
            to.add(ele);
        }
    }
}
