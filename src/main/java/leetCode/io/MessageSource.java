package leetCode.io;

import java.util.Locale;

/**
 * @ClassName MessageSource
 * @Description TODO
 * @Author Dave
 * @Date 2018/8/30 10:11
 * @Version 1.0
 **/
public interface MessageSource {

    String getMessage(String code, Object[] args, String defaultMessage, Locale locale);

    String getMessage(String code, Object[] args, Locale locale);

    String getMessage(MessageSourceResolvable resolvable, Locale locale);
}
