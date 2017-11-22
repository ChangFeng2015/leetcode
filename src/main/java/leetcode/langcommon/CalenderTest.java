package leetcode.langcommon;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest {


    @Test
    public void test() {
        String date = "2017-08";
        System.out.println(firstDay(date));
        System.out.println(lastDay(date));
        System.out.println(addMonth(date, 2));
    }

    public static Date firstDay(final String month) {
        Date date = null;
        if (StringUtils.isNoneBlank(month) && month.contains("-")) {
            String[] array = month.split("-");
            date = firstDay(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
        }
        return date;
    }

    public static Date lastDay(final String month) {
        Date date = null;
        if (StringUtils.isNoneBlank(month) && month.contains("-")) {
            String[] array = month.split("-");
            date = lastDay(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
        }
        return date;
    }

    public static Date firstDay(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        Integer minDay = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, minDay);
        return calendar.getTime();
    }

    public static Date lastDay(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        Integer maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, maxDay);
        return calendar.getTime();
    }

    public static String addMonth(String month, Integer amount) {
        Date date = firstDay(month);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, amount);
        return Integer.toString(calendar.get(Calendar.YEAR)) + "-" + (calendar.get(Calendar.MONTH) + 1);
    }
}
