package leetCode.designPattern.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName TicketMaker
 * @Description TODO
 * @Author Dave
 * @Date 2018/10/10 14:57
 * @Version 1.0
 **/
public enum TicketMaker {
    /**
     * 实例
     */
    INSTANCE;
    private AtomicInteger ticket = new AtomicInteger(1000);

    public int getNextTicketNumber() {
        return ticket.addAndGet(1);
    }

}
