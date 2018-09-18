package leetCode.designPattern.responsibilitychain;

/**
 * 审批handler
 *
 * @author : Dave
 * @version : 2017/11/24
 */

public abstract class ApprovedHandler {

    private ApprovedHandler successor = null;

    public ApprovedHandler getSuccessor() {
        return successor;
    }

    public void setSuccessor(ApprovedHandler successor) {
        this.successor = successor;
    }

    /**
     * 处理费用审批的申请
     *
     * @param user
     * @param fee
     * @return
     */
    public abstract String handleFeeRequest(String user, double fee);
}
