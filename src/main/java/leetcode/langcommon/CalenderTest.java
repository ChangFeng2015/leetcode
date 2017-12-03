package leetcode.langcommon;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 月份加减类
 *
 * author: dave
 */
public class CalenderTest {


    @Test
    public void test() {
        int e = 1;
        DecimalFormat decimalFormat = new DecimalFormat("00");
        System.out.println(decimalFormat.format(e));
        e = 11;
        System.out.println(decimalFormat.format(e));
//        String date = getMonth();
//        System.out.println(firstDay(date));
//        System.out.println(lastDay(date));
//        System.out.println(addMonth(date, 2));
//        System.out.println(compareTheMonth("2016-09", "2017-7"));
    }

    /**
     * 获取某个月的第一天
     *
     * @param month
     * @return
     */
    public static Date firstDay(final String month) {
        Date date = null;
        if (StringUtils.isNoneBlank(month) && month.contains("-")) {
            String[] array = month.split("-");
            date = firstDay(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
        }
        return date;
    }

    /**
     * 获取某个月的最后一天
     *
     * @param month
     * @return
     */
    public static Date lastDay(final String month) {
        Date date = null;
        if (StringUtils.isNoneBlank(month) && month.contains("-")) {
            String[] array = month.split("-");
            date = lastDay(Integer.parseInt(array[0]), Integer.parseInt(array[1]));
        }
        return date;
    }

    /**
     * 获取某个月份的第一天
     *
     * @param year
     * @param month
     * @return
     */
    public static Date firstDay(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        Integer minDay = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, minDay);
        return calendar.getTime();
    }

    /**
     * 获取某个月份的最后一天
     *
     * @param year
     * @param month
     * @return
     */
    public static Date lastDay(Integer year, Integer month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        Integer maxDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        calendar.set(Calendar.DAY_OF_MONTH, maxDay);
        return calendar.getTime();
    }

    /**
     * 增加月份
     *
     * @param month
     * @param amount
     * @return
     */
    public static String addMonth(final String month, final Integer amount) {
        Date date = firstDay(month);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, amount);
        return Integer.toString(calendar.get(Calendar.YEAR)) + "-" + (calendar.get(Calendar.MONTH) + 1);
    }

    /**
     * 获取当前日期的月份
     *
     * @return
     */
    public static String getMonth() {
        Calendar calendar = Calendar.getInstance();
        return Integer.toString(calendar.get(Calendar.YEAR)) + "-" + (calendar.get(Calendar.MONTH) + 1);
    }

    /**
     * 计算月份之间相差了几个月
     *
     * @param thisMonth
     * @param anotherMonth
     * @return
     */
    public static int compareTheMonth(final String thisMonth, final String anotherMonth) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
        Calendar thisCalendar = Calendar.getInstance();
        Calendar anotherCalendar = Calendar.getInstance();

        try {
            thisCalendar.setTime(dateFormat.parse(thisMonth));
            anotherCalendar.setTime(dateFormat.parse(anotherMonth));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int month = anotherCalendar.get(Calendar.MONTH) - thisCalendar.get(Calendar.MONTH);
        int result = (anotherCalendar.get(Calendar.YEAR) - thisCalendar.get(Calendar.YEAR)) * 12;

        return Math.abs(month + result);
    }

}
