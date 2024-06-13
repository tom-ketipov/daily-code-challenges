package leetcode.easy.numbers_smaller_than_the_current_1365;

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
    public void can_calculate_smaller_numbers_for_array_with_distinct_numbers() {
        int[] nums = {1, 2, 7, 3, 4};

        Assertions.assertArrayEquals(new int[]{0, 1, 4, 2, 3}, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void can_calculate_smaller_numbers_for_array_with_duplicated_numbers() {
        int[] nums = {1, 1, 7, 3, 3};

        Assertions.assertArrayEquals(new int[]{0, 0, 4, 2, 2}, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void smallerNumbersThanCurrent_throws_null_pointer_exception_for_null_inputs() {
        try {
            solution.smallerNumbersThanCurrent(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}