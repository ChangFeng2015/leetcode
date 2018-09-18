package leetCode.collection;

/**
 * 队列
 *
 * @author Dave
 * @create 2017-11-13 21:51
 **/

public class Queue<E> {
    private Object[] items;
    private int next = 0;

    public Queue(int capacity) {
        items = new Object[capacity];
    }

    public void add(E obj) {
        if (next < items.length) {
            items[next ++] = obj;
        }
    }

    class QueueSelector implements Selector<E> {

        int index = 0;

        @Override
        public E current() {
            return (E) items[index];
        }

        @Override
        public void next() {
            index ++;
        }

        @Override
        public boolean end() {
            return index >= items.length;
        }
    }

    public Selector getSelector() {
        return new QueueSelector();
    }

//    @Test
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>(7);
        for (int i = 0; i < 7; i ++) {
            integerQueue.add(i);
        }

        Selector selector = integerQueue.getSelector();
        while (!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }

    }

}

interface Selector<T> {
    T current();
    void next();
    boolean end();
}

