package leetcode.easy.create_target_array_in_the_given_order_1389;

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
    public void can_create_an_array_in_the_given_order() {
        int[] nums = {0, 1, 2, 3, 4};
        int[] indexes = {0, 1, 2, 2, 1};

        Assertions.assertArrayEquals(new int[]{0, 4, 1, 3, 2}, solution.createTargetArray(nums, indexes));
    }

    @Test
    public void createTargetArray_throws_null_pointer_exception_if_nums_array_is_null() {
        int[] indexes = {0, 1, 2, 2, 1};

        try {
            solution.createTargetArray(null, indexes);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void createTargetArray_throws_null_pointer_exception_if_indexes_array_is_null() {
        int[] nums = {0, 1, 2, 3, 4};

        try {
            solution.createTargetArray(nums, null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void createTargetArray_throws_illegal_argument_exception_for_input_arrays_with_different_lengths() {
        int[] nums = {0, 1, 2, 3, 4};
        int[] indexes = {0, 1, 2};

        try {
            solution.createTargetArray(nums, indexes);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}