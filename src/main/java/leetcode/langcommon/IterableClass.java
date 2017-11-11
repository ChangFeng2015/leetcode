package leetcode.langcommon;

import org.junit.Test;

import java.util.Iterator;

/**
 * Iterator实现
 *
 * @author Dave
 * @create 2017-11-06 20:47
 **/

public class IterableClass {

    protected String[] words = ("And that is how" + " we know the Earth to be banana-shaped.")
            .split(" ");

    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index ++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass().words) {
            System.out.print(s + " ");
        }
    }
}
