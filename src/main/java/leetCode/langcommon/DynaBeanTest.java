package leetCode.langcommon;

/**
 * DynaBean test
 *
 * @author Dave
 */

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.LazyDynaBean;
import org.junit.Test;


public class DynaBeanTest {

    @Test
    public void Test() {
        DynaBean car = new LazyDynaBean();
        car.set("carNo", 1);
        car.set("owner", "zhangSan");
        System.out.println(car.get("carNo"));
    }

}
