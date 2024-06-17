package leetcode.easy.check_if_two_string_arrays_are_equivalent_1662;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static leetcode.easy.check_if_two_string_arrays_are_equivalent_1662.Solution.MAX_ARR_LENGTH;
import static leetcode.easy.check_if_two_string_arrays_are_equivalent_1662.Solution.MIN_ARR_LENGTH;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_detect_equivalent_strings_concatenated_from_two_valid_lowercase_symbol_arrays() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        Assertions.assertTrue(solution.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void can_detect_unequivalent_strings_concatenated_from_two_lowercase_symbol_arrays() {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "cb"};

        Assertions.assertFalse(solution.arrayStringsAreEqual(word1, word2));
    }

    @Test
    public void arrayStringsAreEqual_throws_illegal_argument_exception_if_word1_length_is_less_than_allowed_min() {
        String[] word2 = {"a"};

        try {
            solution.arrayStringsAreEqual(new String[MIN_ARR_LENGTH - 1], word2);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void arrayStringsAreEqual_throws_illegal_argument_exception_if_word1_length_is_more_than_allowed_max() {
        String[] word2 = {"a"};

        try {
            solution.arrayStringsAreEqual(new String[MAX_ARR_LENGTH + 1], word2);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void arrayStringsAreEqual_throws_illegal_argument_exception_if_word2_length_is_less_than_allowed_min() {
        String[] word1 = {"a"};

        try {
            solution.arrayStringsAreEqual(word1, new String[MIN_ARR_LENGTH - 1]);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void arrayStringsAreEqual_throws_illegal_argument_exception_if_word2_length_is_more_than_allowed_max() {
        String[] word1 = {"a"};

        try {
            solution.arrayStringsAreEqual(word1, new String[MAX_ARR_LENGTH + 1]);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void arrayStringsAreEqual_throws_null_pointer_exception_for_word1_null_input() {
        String[] word2 = {"a", "cb"};

        try {
            solution.arrayStringsAreEqual(null, word2);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void arrayStringsAreEqual_throws_null_pointer_exception_for_word2_null_input() {
        String[] word1 = {"ab", "c"};

        try {
            solution.arrayStringsAreEqual(word1, null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}