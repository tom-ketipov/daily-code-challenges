package leetcode.easy;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest extends BaseTest {
    private PlusOne plusOneSolver;

    @Test
    public void can_increment_last_digit_only() {
        plusOneSolver = new PlusOne();

        int[] arr = {2, 5, 3, 1};
        Assert.assertArrayEquals(new int[]{2, 5, 3, 2}, plusOneSolver.plusOne(arr));
    }

    @Test
    public void can_increment_multiple_elements_without_arr_length_modification() {
        plusOneSolver = new PlusOne();

        int[] arr = {2, 5, 9, 9};
        Assert.assertArrayEquals(new int[]{2, 6, 0, 0}, plusOneSolver.plusOne(arr));
    }

    @Test
    public void can_modify_arr_length_upon_incrementation() {
        plusOneSolver = new PlusOne();

        int[] arr = {9, 9, 9, 9};
        Assert.assertArrayEquals(new int[]{1, 0, 0, 0, 0}, plusOneSolver.plusOne(arr));
    }
}
