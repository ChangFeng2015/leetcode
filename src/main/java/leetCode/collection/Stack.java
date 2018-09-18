package leetCode.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

/**
 * 栈
 *
 * @author Dave
 * @create 2017-11-13 21:33
 **/

public class Stack<T> {

    private LinkedList<T> storage = new LinkedList<>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek() {
        return storage.getFirst();
    }

    public T pop() {
        return storage.removeFirst();
    }

    public boolean empty() {
        return storage.isEmpty();
    }

    @Override
    public String toString() {
        return storage.toString();
    }

    @Test
    public void StackTest() {
        Stack<String> stack = new Stack<>();
        stack.push("a");
        stack.push("b");
        stack.push("c");

        Assert.assertEquals("c", stack.peek());
        Assert.assertEquals("c", stack.pop());
        Assert.assertEquals("b", stack.pop());
        Assert.assertEquals(false, stack.empty());
    }
}
