package leetCode.designPattern.singleton;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SingletonTest {

    @Test
    public void test() {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;
        if (singleton1 == singleton2) {
            System.out.println("obj1 和 obj2 是相同的实例！");
        } else {
            System.out.println("obj1 和 obj2 是不同的实例！");
        }
        System.out.println("End");
    }

    @Test
    public void TicketNumberTest() throws InterruptedException, ExecutionException {
        ExecutorService pool = Executors.newCachedThreadPool();
        List<Callable<Integer>> taskList = new ArrayList<>(3);
        List<Future<Integer>> result = new ArrayList<>(3);
        for (int i = 0; i < 3; i ++) {
            taskList.add(new TicketNumber());
        }
        result = pool.invokeAll(taskList);
        for (Future future : result) {
            System.out.println(future.get());
        }
    }

    class TicketNumber implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            return TicketMaker.INSTANCE.getNextTicketNumber();
        }
    }

    @Test
    public void tripleTest() {
        Triple tripleOne = Triple.getInstance(1);
        Triple tripleTwo = Triple.getInstance(2);
        Triple tripleThree = Triple.getInstance(3);
    }
}
