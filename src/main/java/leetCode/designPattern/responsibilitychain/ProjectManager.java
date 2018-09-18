package leetCode.designPattern.responsibilitychain;

/**
 * 项目经理
 *
 * @author : Dave
 * @date : 2017/11/24
 */

public class ProjectManager extends ApprovedHandler {

    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        /**
         * 项目经理的审批权限在500以内
         */
        if (fee < 500) {
            if ("zhangsan".equals(user)) {
                str = "success: project manager agree " + user + ",amount is " + fee + " RMB";
            } else {
                str = "fail: project manager don't agree";
            }
        } else {
            /**
             * 超过500，继续传给更高级的人处理
             */
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }

}
