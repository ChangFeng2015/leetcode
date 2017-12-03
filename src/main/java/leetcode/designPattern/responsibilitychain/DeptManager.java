package leetcode.designPattern.responsibilitychain;

/**
 * 部门经理
 *
 * @author : Dave
 * @date : 2017/11/24
 */

public class DeptManager extends ApprovedHandler{
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        /**
         * 部门经理的权限在1000以内
         */
        if (fee < 1000) {
            if ("zhangSan".equals(user)) {
                str = "success : dept manager agree " + user + ",money is " + fee + " RMB";
            } else {
                str = "fail:dept manager don't agree!";
            }
        } else {
            /**
             * 超过1000,继续传给更高级别的人处理
             */
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
