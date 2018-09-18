package leetCode.mina;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldHandler extends IoHandlerAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(HelloWorldHandler.class);

    @Override
    public void exceptionCaught(IoSession session, Throwable cause)
            throws Exception {
        super.exceptionCaught(session, cause);
    }

    @Override
    public void messageReceived(IoSession session, Object message)
            throws Exception {
        String string = message.toString();
        if (string.trim().equalsIgnoreCase("quit")) {
            session.close(true);
            return;
        }
        LOGGER.info("recevied message:" + string);
        String reply = " hi, i am server";
        session.write(reply);
        LOGGER.info("message have been written");
    }

    @Override
    public void messageSent(IoSession session, Object message) throws Exception {
        LOGGER.info("message have been sent");
    }

    @Override
    public void sessionClosed(IoSession session) throws Exception {
        LOGGER.info("closed session");
    }

    @Override
    public void sessionCreated(IoSession session) throws Exception {
        LOGGER.info("session created");
    }

    @Override
    public void sessionIdle(IoSession session, IdleStatus status)
            throws Exception {
        LOGGER.info("IDLE "+session.getIdleCount(status));
    }

    @Override
    public void sessionOpened(IoSession session) throws Exception {
        LOGGER.info("session opened");
    }

}
