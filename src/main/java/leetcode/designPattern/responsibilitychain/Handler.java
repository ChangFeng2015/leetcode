package leetcode.designPattern.responsibilitychain;

/**
 * chain of reposibility
 *
 * @author : Dave
 * @date : 2017/11/24
 */
public abstract class Handler {

    protected  Handler successor = null;

    /**
     * 处理请求的方法
     * 这个方法可以根据具体需要来选择是否传递参数
     */
    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
