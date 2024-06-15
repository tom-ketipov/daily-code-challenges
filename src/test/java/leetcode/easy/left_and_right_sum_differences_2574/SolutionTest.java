package leetcode.easy.left_and_right_sum_differences_2574;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static leetcode.easy.left_and_right_sum_differences_2574.Solution.MAX_ARR_LENGTH;
import static leetcode.easy.left_and_right_sum_differences_2574.Solution.MIN_ARR_LENGTH;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_find_left_right_sum_differences_in_array() {
        int[] nums = {10, 4, 8, 3};

        Assertions.assertArrayEquals(new int[]{15, 1, 11, 22}, solution.leftRightDifference(nums));
    }

    @Test
    public void leftRightDifference_throws_null_pointer_exception_for_null_inputs() {

        try {
            solution.leftRightDifference(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void leftRightDifference_throws_illegal_argument_exception_for_empty_array_inputs() {

        try {
            solution.leftRightDifference(new int[0]);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void leftRightDifference_throws_illegal_argument_exception_for_arrays_with_over_one_thousand_elements() {

        try {
            solution.leftRightDifference(new int[1001]);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }
}