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
    public void testOptional(){
        Optional<Integer> possible = Optional.of(6);
        if (possible.isPresent()){
            Assert.assertEquals(Optional.of(6), Optional.of(possible.get()));
        }
    }
}
