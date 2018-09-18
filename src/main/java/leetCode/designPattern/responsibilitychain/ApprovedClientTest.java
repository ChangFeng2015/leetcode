package leetCode.designPattern.responsibilitychain;

import org.junit.Test;

/**
 * 提交审批测试
 *
 * @author : Dave
 * @date : 2017/11/24
 */

public class ApprovedClientTest {

    @Test
    public void test() {
        ApprovedHandler general = new GeneralManager();
        ApprovedHandler dept = new DeptManager();
        ApprovedHandler project = new ProjectManager();

        project.setSuccessor(dept);
        dept.setSuccessor(general);

        /**
         * 提交300RMB一下的申请
         */
        String test1 = project.handleFeeRequest("zhangsan", 300);
        System.out.println("test1 : " + test1);
        String test2 = project.handleFeeRequest("Dave", 300);
        System.out.println("test2 : " + test2);
        System.out.println("-------------------------------");

        /**
         * 提交300 RMB以上的申请
         */
        String test3 = project.handleFeeRequest("zhangSan", 700);
        System.out.println("test3 : " + test3);
        String test4 = project.handleFeeRequest("lifei", 700);
        System.out.println("test4 ：" + test4);
        System.out.println("---------------------------------");

        /**
         * 提交1000 RMB以上的申请
         */
        String test5 = project.handleFeeRequest("zhangSan", 1500);
        System.out.println("test5 : " + test5);
        String test6 = project.handleFeeRequest("lifeic", 1500);
        System.out.println("test6 : " + test6);
    }

}
