package leetcode.guava;

import org.junit.Assert;
import org.junit.Test;

import java.util.Optional;

/**
 * guava optional
 *
 * @author Dave
 */
public class OptionalTest {

    @Test
    public void testOptional() {
        Optional<Integer> possible = Optional.of(6);
        if (possible.isPresent()) {
            Assert.assertEquals(Optional.of(6), Optional.of(possible.get()));
        }
    }

    @Test
    public void testOptional2() {
        Optional<Integer> possible = Optional.of(6);
        Optional<String> nullPossible = Optional.ofNullable(null);

        Assert.assertEquals(true, possible.isPresent());
        Assert.assertEquals(Optional.of(6), possible);
    }

    private Optional method() {
        return Optional.ofNullable(null);
    }

    private Optional methodNoNull() {
        return Optional.ofNullable(15L);
    }

    public void testMethodReturn() {
        Optional<Long> value = method();
        if (value.isPresent()){
            System.out.println(value.get());
        } else {
            System.out.println(value.orElse(-12L));
        }
        System.out.println(value.get());
//        value.ifPresent();
    }
}
