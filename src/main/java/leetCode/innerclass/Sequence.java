package leetCode.innerclass;

/**
 * Created by Dave on 2017/9/20.
 */
public class Sequence<E> {
    private Object[] items;
    private int next = 0;

    public Sequence(int size){
        items = new Object[size];
    }

    public E add(E o){
        if(next < items.length){
            items[next ++] = o;
            return o;
        }
        return null;
    }
    interface Selector<E>{
        boolean end();
        E current();
        void next();
    }
    private class SequenceSelector<E> implements Selector<E>{

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public E current() {
            return (E)items[i];
        }

        @Override
        public void next() {
            if(i < items.length)
                i ++;
        }
    }

    public Selector selector(){
        return new SequenceSelector<>();
    }

    public static void main(String[] args){
        Sequence<Integer> sequence = new Sequence<>(10);
        for(int i = 0; i < 10; i ++){
            sequence.add(i);
        }
        Selector selector = sequence.selector();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }
    }
}
