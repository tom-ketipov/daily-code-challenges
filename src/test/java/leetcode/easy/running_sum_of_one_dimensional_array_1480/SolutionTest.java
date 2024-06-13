package leetcode.easy.running_sum_of_one_dimensional_array_1480;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_calculate_running_sum_of_one_dimensional_array_with_multiple_elements() {
        int[] nums = {1, 2, 3, 4};

        Assertions.assertArrayEquals(new int[]{1, 3, 6, 10}, solution.runningSum(nums));
    }

    @Test
    public void runningSum_method_returns_empty_array_for_empty_array_input() {
        int[] nums = {};

        Assertions.assertArrayEquals(new int[]{}, solution.runningSum(nums));
    }

    @Test
    public void runningSum_method_throws_null_pointer_exception_for_null_input() {
        try {
            solution.runningSum(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}