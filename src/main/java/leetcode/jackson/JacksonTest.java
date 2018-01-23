package leetcode.jackson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JacksonTest {
    public static void main(String[] args) throws ParseException {
        String date = "20160413160044";
        SimpleDateFormat sdf =   new SimpleDateFormat( "yyyyMMddHHmmss" );

        Date a = sdf.parse(date);

        String c = "error";
        System.out.println(c.toUpperCase());
    }
}
