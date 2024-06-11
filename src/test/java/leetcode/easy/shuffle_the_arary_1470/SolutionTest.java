package leetcode.easy.shuffle_the_arary_1470;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private Solution arrayShuffleSolver;

    @BeforeEach
    void setUp() {
        arrayShuffleSolver = new Solution();
    }

    @Test
    public void can_shuffle_an_array_with_even_x_and_y_elements() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int splitIndex = 3;

        Assertions.assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, arrayShuffleSolver.shuffle(nums, splitIndex));
    }

    @Test
    public void can_shuffle_an_array_with_lower_x_and_bigger_y_elements() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int splitIndex = 1;

        Assertions.assertArrayEquals(new int[]{2, 5, 1, 3, 4, 7}, arrayShuffleSolver.shuffle(nums, splitIndex));
    }

    @Test
    public void can_shuffle_an_array_with_higher_x_and_lower_y_elements() {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int splitIndex = 4;

        Assertions.assertArrayEquals(new int[]{2, 4, 5, 7, 1, 3}, arrayShuffleSolver.shuffle(nums, splitIndex));
    }

    @Test
    public void shuffle_throws_null_pointer_exception_for_null_input_array() {
        int splitIndex = 4;

        try {
            arrayShuffleSolver.shuffle(null, splitIndex);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void shuffle_throws_illegal_argument_exception_for_empty_arrays() {
        int[] nums = {};
        int splitIndex = 4;

        try {
            arrayShuffleSolver.shuffle(nums, splitIndex);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ARRAY_LENGTH_ERROR.getExceptionMessage(1, Integer.MAX_VALUE), e.getMessage());
        }
    }

    @Test
    public void shuffle_throws_illegal_argument_exception_for_negative_split_index_value() {
        int[] nums = {1, 2, 4, 19, 3, 7};
        int splitIndex = -4;

        try {
            arrayShuffleSolver.shuffle(nums, splitIndex);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(0, nums.length - 1), e.getMessage());
        }
    }

    @Test
    public void shuffle_throws_illegal_argument_exception_for_split_index_bigger_than_array_length() {
        int[] nums = {1, 2, 4, 19, 3, 7};
        int splitIndex = 24;

        try {
            arrayShuffleSolver.shuffle(nums, splitIndex);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(0, nums.length - 1), e.getMessage());
        }
    }
}