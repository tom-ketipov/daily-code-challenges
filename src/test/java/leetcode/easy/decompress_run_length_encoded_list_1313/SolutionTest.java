package leetcode.easy.decompress_run_length_encoded_list_1313;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static leetcode.easy.decompress_run_length_encoded_list_1313.Solution.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_decompress_positive_values_array_with_even_length() {
        int[] nums = {1, 1, 2, 2, 3, 4, 5, 10};
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 4, 4, 4, 10, 10, 10, 10, 10}, solution.decompressRLElist(nums));
    }

    @Test
    public void can_decompress_array_with_min_allowed_length() {
        int[] nums = {5, 10};
        Assertions.assertArrayEquals(new int[]{10, 10, 10, 10, 10}, solution.decompressRLElist(nums));
    }

    @Test
    public void decompressRLElist_throws_illegal_argument_exception_for_input_arrays_with_odd_length() {
        int[] nums = {1, 1, 2, 2, 3, 4, 5};

        try {
            solution.decompressRLElist(nums);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void decompressRLElist_throws_illegal_argument_exception_for_empty_input_arrays() {
        int[] nums = {};

        try {
            solution.decompressRLElist(nums);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void decompressRLElist_throws_illegal_argument_exception_for_input_arrays_with_more_than_one_hundred_elements() {
        try {
            solution.decompressRLElist(new int[101]);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void decompressRLElist_throws_illegal_argument_exception_for_input_arrays_values_smaller_than_min_allowed() {
        int[] nums = {1, MIN_VALUE - 1, 8, 2,};

        try {
            solution.decompressRLElist(nums);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE), e.getMessage());
        }
    }

    @Test
    public void decompressRLElist_throws_illegal_argument_exception_for_input_arrays_values_bigger_than_max_allowed() {
        int[] nums = {1, MAX_VALUE + 1, 2, 2, 12, 34};

        try {
            solution.decompressRLElist(nums);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE), e.getMessage());
        }
    }

    @Test
    public void decompressRLElist_throws_null_pointer_exception_for_null_input() {
        try {
            solution.decompressRLElist(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}