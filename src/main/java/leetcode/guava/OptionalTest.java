package leetcode.guava;

import com.google.common.base.Optional;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


/**
 * guava optional
 *
 * @author Dave
 */
public class OptionalTest {

//    @Test
//    public void testOptional() {
//        Optional<Integer> possible = Optional.of(6);
//        if (possible.isPresent()) {
//            Assert.assertEquals(Optional.of(6), Optional.of(possible.get()));
//        }
//    }
//
//    @Test
//    public void testOptional2() {
//        Optional<Integer> possible = Optional.of(6);
//        Optional<String> nullPossible = Optional.ofNullable(null);
//
//        Assert.assertEquals(true, possible.isPresent());
//        Assert.assertEquals(Optional.of(6), possible);
//    }
//
//    private Optional method() {
//        return Optional.ofNullable(null);
//    }
//
//    private Optional methodNoNull() {
//        return Optional.ofNullable(15L);
//    }
//
//    public void testMethodReturn() {
//        Optional<Long> value = method();
//        if (value.isPresent()){
//            System.out.println(value.get());
//        } else {
//            System.out.println(value.orElse(-12L));
//        }
//        System.out.println(value.get());
////        value.ifPresent();
//    }

    @Test
    public void test() {
//        MoneyAccount moneyAccount = new MoneyAccount();
//        OptionalTest(null);

//        List<Integer> list = null;
//        if (null != list && list.size() > 0) {
//            for (Integer i : list) {
//                System.out.println(i);
//            }
//        }

        Optional<List<Integer>> listOptional = Optional.fromNullable(Arrays.asList(1, 2, 3));
        if (listOptional.isPresent()) {
            for (Integer i : listOptional.get()) {
                System.out.println(i);
            }
        }


    }

    private void OptionalTest(MoneyAccount moneyAccount) {
        MoneyAccount instance = new MoneyAccount();
        Optional<MoneyAccount> moneyAccountOptional = com.google.common.base.Optional.fromNullable(moneyAccount);
//        if (moneyAccountOptional.isPresent()) {
            instance.setCode(moneyAccountOptional.get().getCode());
            instance.setId(moneyAccountOptional.get().getId());
            instance.setName(moneyAccountOptional.get().getName());
//        }
        Assert.assertSame(moneyAccount, instance);
    }
}
