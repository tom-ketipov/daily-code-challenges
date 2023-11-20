package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;

public class MergeSortedArrayTest {
    private MergeSortedArray mergeSortedArraySolver;

    @Test
    public void can_merge_two_arrays_in_sorted_state() {
        mergeSortedArraySolver = new MergeSortedArray();

        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        int n = num2.length;
        int m = num1.length - n;

        Assert.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, mergeSortedArraySolver.merge(num1, m, num2, n));
    }

    @Test
    public void can_merge_two_arrays_if_secondary_array_is_empty() {
        mergeSortedArraySolver = new MergeSortedArray();

        int[] num1 = {0};
        int[] num2 = {};
        int n = num2.length;
        int m = num1.length - n;

        Assert.assertArrayEquals(new int[]{0}, mergeSortedArraySolver.merge(num1, m, num2, n));
    }

    @Test
    public void cant_merge_two_arrays_if_the_target_array_is_empty() {
        mergeSortedArraySolver = new MergeSortedArray();

        int[] num1 = {2, 5, 0, 0};
        int[] num2 = {1, 2, 3};
        int n = num2.length;
        int m = num1.length - n;

        try {
            mergeSortedArraySolver.merge(num1, m, num2, n);
        } catch (InvalidParameterException e) {
            Assert.assertEquals(e.getMessage(), "Target array cannot be smaller than the secondary one.");
        }
    }

    @Test
    public void cant_merge_two_arrays_if_the_target_array_is_smaller_than_secondary() {
        mergeSortedArraySolver = new MergeSortedArray();

        int[] num1 = {};
        int[] num2 = {1, 2, 3};
        int n = num2.length;
        int m = num1.length - n;

        try {
            mergeSortedArraySolver.merge(num1, m, num2, n);
        } catch (InvalidParameterException e) {
            Assert.assertEquals(e.getMessage(), "Target array cannot be smaller than the secondary one.");
        }
    }
}
