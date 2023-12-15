package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.ValidationMessages;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MergeSortedArrayTest {
    private MergeSortedArray mergeSortedArraySolver;

    @BeforeEach
    public void setUp() {
        mergeSortedArraySolver = new MergeSortedArray();
    }

    @Test
    public void can_merge_two_arrays_in_sorted_state() {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        int n = num2.length;
        int m = num1.length - n;

        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, mergeSortedArraySolver.merge(num1, m, num2, n));
    }

    @Test
    public void can_merge_two_arrays_if_secondary_array_is_empty() {
        int[] num1 = {0};
        int[] num2 = {};
        int n = num2.length;
        int m = num1.length - n;

        assertArrayEquals(new int[]{0}, mergeSortedArraySolver.merge(num1, m, num2, n));
    }

    @Test
    public void cant_merge_two_arrays_if_the_target_array_is_empty() {
        int[] num1 = {2, 5, 0, 0};
        int[] num2 = {1, 2, 3};
        int n = num2.length;
        int m = num1.length - n;

        try {
            mergeSortedArraySolver.merge(num1, m, num2, n);
        } catch (IllegalArgumentException e) {
            assertEquals(ValidationMessages.NOT_IN_RANGE_EXCEPTION_MESSAGE, e.getMessage());
        }
    }

    @Test
    public void cant_merge_two_arrays_if_the_target_array_is_smaller_than_secondary() {
        int[] num1 = {};
        int[] num2 = {1, 2, 3};
        int n = num2.length;
        int m = num1.length - n;

        try {
            mergeSortedArraySolver.merge(num1, m, num2, n);
        } catch (IllegalArgumentException e) {
            assertEquals(ValidationMessages.NOT_IN_RANGE_EXCEPTION_MESSAGE, e.getMessage());
        }
    }
}
