package leetCode.function;

import javax.swing.*;

/**
 * @Author:Dave
 * @Description:
 * @Date: 2017/9/14 20:52
 */
public class ConstructorTest {
    public static void main(String[] args){
        Constructor constructor = JFrame::new;
        Constructor yt = a -> new JFrame(a);
        JFrame jf = yt.win("china");
        System.out.println(jf);
    }
}
