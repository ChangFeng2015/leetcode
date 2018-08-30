package leetCode.context;

import java.util.EventObject;

/**
 * @ClassName ApplicationEvent
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/30 10:37
 * @Version 1.0
 **/
public abstract class ApplicationEvent extends EventObject {


    private static final long serialVersionUID = 94260118681385216L;

    private final long timestamp;

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
        this.timestamp = System.currentTimeMillis();
    }

    public final long getTimestamp() {
        return timestamp;
    }
}
