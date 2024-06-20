package leetcode.easy.number_of_arithmetic_triplets_2367;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static leetcode.easy.number_of_arithmetic_triplets_2367.Solution.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_find_count_of_arithmetic_triplets_when_they_exist() {
        int[] nums = {MIN_VALUE, 1, 4, 6, 7, MAX_VALUE, 10};
        int diff = 3;

        Assertions.assertEquals(2, solution.arithmeticTriplets(nums, diff));
    }

    @Test
    public void arithmeticTriplets_returns_zero_if_no_triplets_are_found() {
        int[] nums = {MIN_VALUE, 1, 4, 6, 7, 10};
        int diff = MAX_DIFF;

        Assertions.assertEquals(0, solution.arithmeticTriplets(nums, diff));
    }

    @Test
    public void arithmeticTriplets_throws_illegal_argument_exception_for_diff_smaller_than_allowed_minimum() {
        int[] nums = {MIN_VALUE, 1, 4, 6, 7, 10};
        int diff = MIN_DIFF - 1;

        try {
            solution.arithmeticTriplets(nums, diff);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_DIFF, MAX_DIFF),
                    e.getMessage());
        }
    }

    @Test
    public void arithmeticTriplets_throws_illegal_argument_exception_for_diff_bigger_than_allowed_minimum() {
        int[] nums = {MIN_VALUE, 1, 4, 6, 7, 10};
        int diff = MAX_DIFF + 1;

        try {
            solution.arithmeticTriplets(nums, diff);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_DIFF, MAX_DIFF),
                    e.getMessage());
        }
    }

    @Test
    public void arithmeticTriplets_throws_illegal_argument_exception_for_array_value_smaller_than_allowed_minimum() {
        int[] nums = {MIN_VALUE, MIN_VALUE - 1, 4, 6, 7, 10};
        int diff = MIN_DIFF;

        try {
            solution.arithmeticTriplets(nums, diff);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE),
                    e.getMessage());
        }
    }

    @Test
    public void arithmeticTriplets_throws_illegal_argument_exception_for_array_value_bigger_than_allowed_maximum() {
        int[] nums = {MIN_VALUE, MAX_VALUE + 1, 4, 6, 7, 10};
        int diff = MIN_DIFF;

        try {
            solution.arithmeticTriplets(nums, diff);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE),
                    e.getMessage());
        }
    }

    @Test
    public void arithmeticTriplets_throws_illegal_argument_exception_for_input_array_with_length_smaller_than_allowed_minimum
            () {
        int[] nums = {1, 5};
        int diff = 3;

        try {
            solution.arithmeticTriplets(nums, diff);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH),
                    e.getMessage());
        }
    }

    @Test
    public void arithmeticTriplets_throws_illegal_argument_exception_for_input_array_with_length_bigger_than_allowed_maximum
            () {
        int[] nums = new int[MAX_ARR_LENGTH + 1];
        int diff = 3;

        try {
            solution.arithmeticTriplets(nums, diff);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH),
                    e.getMessage());
        }
    }


    @Test
    public void arithmeticTriplets_throws_null_pointer_exception_for_null_input_array() {
        int diff = 3;

        try {
            solution.arithmeticTriplets(null, diff);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}