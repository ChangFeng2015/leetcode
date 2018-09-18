package leetCode.proxy;

/**
 * 静态代理类
 *
 * @author Dave
 * @create 2017-11-15 11:43
 **/

public class StaticProxyFactory implements DemoDao {

    private DemoDao demoDao;

    public StaticProxyFactory(DemoDao demoDao) {
        this.demoDao = demoDao;
    }

    @Override
    public void save() {
        System.out.println("this is staicProxyFactory start!");
        demoDao.save();
        System.out.println("this is staticProxyFactory end!");
    }

    public static void main(String[] args) {
        IDemoDao iDemoDao = new IDemoDao();
        StaticProxyFactory staticProxyFactory = new StaticProxyFactory(iDemoDao);

        staticProxyFactory.save();
    }
}
