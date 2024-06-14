package leetcode.easy.concatenation_of_array_1929;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution concatenationOfArraySolver;

    @BeforeEach
    void setUp() {
        concatenationOfArraySolver = new Solution();
    }

    @Test
    public void can_concatenate_single_array_with_itself() {
        int[] nums = {1, 3, 2, 1};

        Assertions.assertArrayEquals(new int[]{1, 3, 2, 1, 1, 3, 2, 1}, concatenationOfArraySolver.getConcatenation(nums));
    }

    @Test
    public void getConcatenation_throws_null_pointer_exception_for_null_inputs() {
        try {
            concatenationOfArraySolver.getConcatenation(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void getConcatenation_throws_illegal_argument_exception_for_empty_arrays() {
        try {
            concatenationOfArraySolver.getConcatenation(new int[]{});
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(1, 1000), e.getMessage());
        }
    }
}