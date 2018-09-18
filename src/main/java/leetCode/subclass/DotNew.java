package leetCode.subclass;

/**
 * @Author:Dave
 * @Description:使用new创建内部类
 * @Date: 2017/9/24 17:36
 */
public class DotNew {
    class Inner{}
    public static void main(String[] args){
        DotNew dn = new DotNew();
        DotNew.Inner dni = dn.new Inner();
    }
}
