//package leetcode.quartz;
//
//import org.quartz.JobExecutionContext;
//import org.quartz.JobExecutionException;
//import org.quartz.JobListener;
//
///**
// * @author Dave
// * @create 2017-11-12 21:40
// **/
//
//public class HelloJobListener implements JobListener {
//
//    public static final String LISTENER_NAME = "dummyJobListenerName";
//
//    @Override
//    public String getName() {
//        return LISTENER_NAME;
//    }
//
//    @Override
//    public void jobToBeExecuted(JobExecutionContext context) {
//        String jobName = context.getJobDetail()
//                .getKey()
//                .toString();
//
//        System.out.println("jobToBeExecuted");
//        System.out.println("Job : " + jobName + " is going to start...");
//    }
//
//    @Override
//    public void jobExecutionVetoed(JobExecutionContext context, JobExecutionException jobException) {
//        System.out.println("jobWasExecuted");
//
//        String jobName = context.getJobDetail()
//                .getKey()
//                .toString();
//        System.out.println("Job : " + jobName + " is finished...");
//
//        if ()
//    }
//
//    @Override
//    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {
//
//    }
//}
