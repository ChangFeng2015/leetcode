package leetCode.langcommon;

import org.junit.Test;

import java.util.Arrays;

public class ArraysTest {
    @Test
    public void binarySearchTest() {
        String[] array = ("I'm Chinese, you are American!").split(" ");
        int index = Arrays.binarySearch(array, "are");
        System.out.println(index);
    }
}
