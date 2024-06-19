package leetcode.easy.difference_between_element_sum_and_digit_sum_of_an_array_2535;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static leetcode.easy.difference_between_element_sum_and_digit_sum_of_an_array_2535.Solution.MAX_VALUE;
import static leetcode.easy.difference_between_element_sum_and_digit_sum_of_an_array_2535.Solution.MIN_VALUE;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_return_the_absolute_difference_between_array_elements_and_element_sum() {
        int[] nums = {MIN_VALUE, 19, 6, 3, MAX_VALUE};

        Assertions.assertEquals(2007, solution.differenceOfSum(nums));
    }

    @Test
    public void differenceOfSum_throws_illegal_argument_exception_for_input_array_with_length_bigger_than_allowed_max() {
        try {
            solution.differenceOfSum(new int[MAX_VALUE + 1]);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE),
                    e.getMessage());
        }
    }

    @Test
    public void differenceOfSum_throws_illegal_argument_exception_for_input_array_with_length_smaller_than_allowed_min() {
        try {
            solution.differenceOfSum(new int[0]);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE),
                    e.getMessage());
        }
    }

    @Test
    public void differenceOfSum_throws_illegal_argument_exception_for_array_element_bigger_than_allowed_max() {
        try {
            solution.differenceOfSum(new int[]{MAX_VALUE + 1});
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE),
                    e.getMessage());
        }
    }

    @Test
    public void differenceOfSum_throws_illegal_argument_exception_for_array_element_smaller_than_allowed_min() {
        try {
            solution.differenceOfSum(new int[]{MIN_VALUE - 1});
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE),
                    e.getMessage());
        }
    }

    @Test
    public void differenceOfSum_throws_null_pointer_exception_for_null_array_input() {
        try {
            solution.differenceOfSum(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}