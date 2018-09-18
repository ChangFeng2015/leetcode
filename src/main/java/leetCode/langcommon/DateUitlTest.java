package leetCode.langcommon;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUitlTest {

    @Test
    public void testAdd(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date now = new Date();
        Date result = DateUtils.addDays(now, -3);
        System.out.println(simpleDateFormat.format(now) + "-------------" + simpleDateFormat.format(result));
    }
}
