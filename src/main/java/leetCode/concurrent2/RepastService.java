package leetCode.concurrent2;

import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Predicate;

/**
 * @ClassName RepastService
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/30 14:49
 * @Version 1.0
 **/
public class RepastService {

    private volatile Semaphore setSemaphore = new Semaphore(10);
    private volatile Semaphore getSemaphore = new Semaphore(20);
    private volatile ReentrantLock lock = new ReentrantLock();
    private volatile Condition setCondition = lock.newCondition();
    private volatile Condition getCondition = lock.newCondition();
    private volatile Object[] producePositions = new Object[4];

    public boolean filter(Predicate p) {
        for (int i = 0; i < producePositions.length; i ++) {
            if (p.test(producePositions[i])) {
                return false;
            }
        }
        return true;
    }

    public void set() {
        try {
            setSemaphore.acquire();
            lock.lock();
            while (filter((Object o) -> Objects.isNull(o))) {
                setCondition.await();
            }
            for (int i = 0; i < producePositions.length; i ++) {
                if (Objects.isNull(producePositions[i])) {
                    producePositions[i] = "数据";
                    System.out.println(Thread.currentThread().getName() + "生产了" + producePositions[i]);
                    break;
                }
            }
            getCondition.signalAll();
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            setSemaphore.release();
        }
    }

    public void get() {
        try {
            getSemaphore.acquire();
            lock.lock();
            while (filter((Object o) -> Objects.nonNull(o))) {
                getCondition.await();
            }
            for (int i = 0; i < producePositions.length; i ++) {
                if (Objects.nonNull(producePositions[i])) {
                    System.out.println(Thread.currentThread().getName() + "消费了" + producePositions[i]);
                    producePositions[i] = null;
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            getSemaphore.release();
        }
    }


}
