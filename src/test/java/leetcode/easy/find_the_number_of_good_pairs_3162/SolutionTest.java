package leetcode.easy.find_the_number_of_good_pairs_3162;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_find_good_pairs_in_two_non_empty_arrays() {
        int[] nums1 = {1, 2, 4, 12};
        int[] nums2 = {2, 4};
        int k = 3;

        Assertions.assertEquals(2, solution.numberOfPairs(nums1, nums2, k));
    }

    @Test
    public void numberOfPairs_throws_null_pointer_exception_for_null_input_for_the_first_array() {
        int[] nums = {1, 3, 4};
        int k = 1;

        try {
            solution.numberOfPairs(null, nums, k);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void numberOfPairs_throws_null_pointer_exception_for_null_input_for_the_second_array() {
        int[] nums = {1, 3, 4};
        int k = 1;

        try {
            solution.numberOfPairs(nums, null, k);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void numberOfPairs_throws_illegal_argument_exception_if_the_first_array_length_is_empty() {
        int[] nums = {1, 3, 4};
        int k = 1;

        try {
            solution.numberOfPairs(new int[0], nums, k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(solution.getMinArrLength(), solution.getMaxArrLength()), e.getMessage());
        }
    }

    @Test
    public void numberOfPairs_throws_illegal_argument_exception_if_the_second_array_length_is_empty() {
        int[] nums = {1, 3, 4};
        int k = 1;

        try {
            solution.numberOfPairs(nums, new int[0], k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(solution.getMinArrLength(), solution.getMaxArrLength()), e.getMessage());
        }
    }

    @Test
    public void numberOfPairs_throws_illegal_argument_exception_if_the_first_array_length_is_more_than_fifty_elements_long() {
        int[] nums = {1, 3, 4};
        int k = 1;

        try {
            solution.numberOfPairs(new int[51], nums, k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(solution.getMinArrLength(), solution.getMaxArrLength()), e.getMessage());
        }
    }

    @Test
    public void numberOfPairs_throws_illegal_argument_exception_if_the_second_array_length_is_more_than_fifty_elements_long() {
        int[] nums = {1, 3, 4};
        int k = 1;

        try {
            solution.numberOfPairs(new int[51], nums, k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(solution.getMinArrLength(), solution.getMaxArrLength()), e.getMessage());
        }
    }
}