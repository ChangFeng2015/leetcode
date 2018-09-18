package leetCode.threadtest;

public class Queue {
    private Object[] items;
    private int next = 0;

    public Queue(int size){
        items = new Object[size];
    }

    public void add(Object item){
        if(next < items.length){
            items[next] = item;
            next ++;
        }
    }

    private class QueueSelector implements Selector{

        int count = 0;
        @Override
        public boolean end() {
            return count == items.length;
        }

        @Override
        public Object current() {
            return items[count];
        }

        @Override
        public void next() {
            count ++;
        }
    }

    public Selector getSelector(){
        return new QueueSelector();
    }

    public static void main(String[] args){
        Queue queue = new Queue(30);
        for(String s : "lifei is a big dog!".split(" ")){
            queue.add(s);
        }

        Selector selector = queue.getSelector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}

interface Selector{
    boolean end();
    Object current();
    void next();
}
