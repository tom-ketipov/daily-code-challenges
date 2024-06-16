package leetcode.easy.minimum_number_game_2974;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static leetcode.easy.minimum_number_game_2974.Solution.MAX_ARR_LENGTH;
import static leetcode.easy.minimum_number_game_2974.Solution.MIN_ARR_LENGTH;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_generate_minimum_number_game_array_for_even_length_input_arrays() {
        int[] nums = {5, -1, 2, -10, 7, 0};
        Assertions.assertArrayEquals(new int[]{-1, -10, 2, 0, 7, 5}, solution.numberGame(nums));
    }

    @Test
    public void numberGame_throws_illegal_argument_exception_for_odd_length_input_arrays() {
        int[] nums = {5, 4, 2, 3, 7};

        try {
            solution.numberGame(nums);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void numberGame_throws_illegal_argument_exception_for_input_arrays_with_less_than_min_allowed_elements() {
        try {
            solution.numberGame(new int[MIN_ARR_LENGTH - 1]);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void numberGame_throws_illegal_argument_exception_for_input_arrays_with_more_than_max_allowed_elements() {
        try {
            solution.numberGame(new int[MAX_ARR_LENGTH + 1]);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void numberGame_throws_null_pointer_exception_for_null_inputs() {
        try {
            solution.numberGame(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}