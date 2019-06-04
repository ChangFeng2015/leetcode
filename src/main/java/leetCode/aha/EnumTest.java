package leetCode.aha;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.junit.Assert.*;

public class EnumTest {


    @Test
    public void getResult() {
        Enum sample = new Enum();
        List result = sample.getResult();
        Assert.assertEquals(3, result.size());
    }
}
