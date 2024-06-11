package leetcode.easy.two_sum_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private Solution twoSum;

    @BeforeEach
    public void setUp() {
        twoSum = new Solution();
    }

    @Test
    public void can_get_addition_indexes_for_valid_arr() {
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        int[] resultIndexes = twoSum.twoSum(arr, target);
        assertEquals(target, arr[resultIndexes[0]] + arr[resultIndexes[1]]);
    }

    @Test
    public void cant_get_addition_indexes_for_invalid_arr() {
        int[] arr = {2, 7, 11, 15};
        int target = 33;

        int[] resultIndexes = twoSum.twoSum(arr, target);
        assertEquals(-1, resultIndexes[0]);
        assertEquals(-1, resultIndexes[1]);
    }

    @Test
    public void first_valid_pair_is_returned_for_valid_arr_with_multiple_valid_combinations() {
        int[] arr = {2, 7, 11, 2, 7, 15};
        int target = 9;

        int[] resultIndexes = twoSum.twoSum(arr, target);
        assertEquals(0, resultIndexes[0]);
        assertEquals(1, resultIndexes[1]);
    }
}
