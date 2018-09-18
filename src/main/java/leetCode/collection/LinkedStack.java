package leetCode.collection;

/**
 * 链表
 *
 * @author Dave
 * @create 2017-11-13 22:07
 **/

public class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;

        Node() {
            item = null;
            next = null;
        }

        Node(U item, Node next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>();

    public void push(T item) {
        top = new Node<>(item, top);
    }

    public T pop() {
        T result = top.item;

        if (!top.end()) {
            top = top.next;
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> linkedStack = new LinkedStack<>();
        for (String s : "I am a Chinese".split(" ")) {
            linkedStack.push(s);
        }

        String s;
        while ((s = linkedStack.pop()) != null) {
            System.out.println(s);
        }

        LinkedStack<Integer> integerLinkedStack = new LinkedStack<>();
        for (int i = 0; i < 10; i ++) {
            integerLinkedStack.push(i);
        }

        Integer k;
        while ((k = integerLinkedStack.pop()) != null) {
            System.out.println(k);
        }
    }
}
