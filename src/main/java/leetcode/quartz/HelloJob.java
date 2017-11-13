package leetcode.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author Dave
 * @create 2017-11-12 20:54
 **/

public class HelloJob implements Job{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("hello quartz!");
        throw new JobExecutionException("Test Exception");
    }
}
