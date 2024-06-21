package leetcode.easy.count_number_of_pairs_with_absolute_difference_k_2006;

import com.github.javafaker.Faker;
import enums.ValidationMessageType;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static leetcode.easy.count_number_of_pairs_with_absolute_difference_k_2006.Solution.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_find_number_of_pairs_with_absolute_difference_for_only_positive_differences() {
        int[] nums = {3, 2, 1, 5, 4};
        int diff = 2;

        Assertions.assertEquals(3, solution.countKDifference(nums, diff));
    }

    @Test
    public void can_find_number_of_pairs_with_absolute_difference_for_positive_and_negative_differences() {
        int[] nums = {1, 2, 2, 1, 1, 67, 96, 99, 49, 64, 82, 37, 87, 65, 18, 55, 98, 49, 1, 25, 94, 79, 67, 48, 1, 40, 55, 4, 28, 16, 51, 3, 87, 47, 17, 58, 49, 70, 40, 69, 19, 14, 57, 88, 48, 71, 19, 57,
                7, 30, 17, 37, 28, 93, 22, 1, 89, 12, 45, 11, 31, 4, 44, 75, 61, 53, 85, 58, 7, 75, 5, 96, 74, 2, 98, 89, 61, 74, 20, 85, 18, 24, 65, 35, 85, 45, 18, 64, 74, 74, 57, 85, 63, 50, 15, 29, 71, 27, 97, 26,
                21, 85, 2, 12, 85, 27, 98, 1, 85, 51, 99, 60, 86, 7, 94, 63, 4, 16, 30, 49, 95, 94, 38, 69, 84, 20, 55, 63, 59, 77, 16, 40, 66, 78, 68, 78, 91, 4, 69, 38, 75, 9, 5, 69, 46, 14, 47, 99, 48, 7, 3, 5, 1,
                31, 8, 85, 47, 41, 84, 44, 73, 9, 31, 28, 18, 2, 37, 37, 10, 95, 25, 15, 93, 31, 96, 7, 28, 52, 2, 66, 44, 21, 7, 28, 88, 7, 87, 48, 21, 43, 32, 76, 5, 52, 68, 69, 28, 34, 46, 96};
        int diff = 50;

        Assertions.assertEquals(218, solution.countKDifference(nums, diff));
    }

    @Test
    public void countKDifference_returns_zero_when_no_pairs_are_found() {
        int[] nums = {2, 2};
        int diff = 1;

        Assertions.assertEquals(0, solution.countKDifference(nums, diff));
    }

    @Test
    public void countKDifference_throws_illegal_argument_exception_if_input_array_length_is_bigger_than_allowed_maximum() {
        try {
            solution.countKDifference(new int[MAX_ARR_LENGTH + 1], MIN_DIFF);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH),
                    e.getMessage());
        }
    }

    @Test
    public void countKDifference_throws_illegal_argument_exception_if_input_array_length_is_smaller_than_allowed_minimum() {
        try {
            solution.countKDifference(new int[MIN_ARR_LENGTH - 1], MIN_DIFF);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH),
                    e.getMessage());
        }
    }

    @Test
    public void countKDifference_throws_illegal_argument_exception_if_input_array_value_is_bigger_than_allowed_maximum() {
        int[] nums = {MIN_VALUE, MAX_VALUE, MAX_VALUE + 1};
        int diff = MAX_DIFF;

        try {
            solution.countKDifference(nums, diff);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE),
                    e.getMessage());
        }
    }

    @Test
    public void countKDifference_throws_illegal_argument_exception_if_input_array_value_is_smaller_than_allowed_minimum() {
        int[] nums = {MIN_VALUE - 1, MAX_VALUE / 2, MAX_VALUE};
        int diff = MAX_DIFF;

        try {
            solution.countKDifference(nums, diff);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE),
                    e.getMessage());
        }
    }

    @Test
    public void countKDifference_throws_illegal_argument_exception_if_the_difference_value_is_bigger_than_allowed_maximum() {
        int[] nums = {MIN_VALUE, MAX_VALUE / 2, MAX_VALUE};
        int diff = MAX_DIFF + 1;

        try {
            solution.countKDifference(nums, diff);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_DIFF, MAX_DIFF),
                    e.getMessage());
        }
    }

    @Test
    public void countKDifference_throws_illegal_argument_exception_if_the_difference_value_is_smaller_than_allowed_minimum() {
        int[] nums = {MIN_VALUE, MAX_VALUE / 2, MAX_VALUE};
        int diff = MIN_DIFF - 1;

        try {
            solution.countKDifference(nums, diff);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_DIFF, MAX_DIFF),
                    e.getMessage());
        }
    }

    @Test
    public void countKDifference_throws_null_pointer_exception_for_null_input() {
        int diff = MIN_DIFF;

        try {
            solution.countKDifference(null, diff);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}