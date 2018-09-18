package leetCode.designPattern.responsibilitychain;

/**
 * 总经理
 *
 * @author : Dave
 * @date : 2017/11/24
 */

public class GeneralManager extends ApprovedHandler{
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";

        if (fee >= 1000) {
            if ("zhangSan".equals(user)) {
                str = "agress,general manager is busy";
            } else {
                str = "general manager don't agree!";
            }
        } else {
            if (getSuccessor() != null) {
                return getSuccessor().handleFeeRequest(user, fee);
            }
        }
        return str;
    }
}
