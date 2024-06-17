package leetcode.easy.truncate_sentence_1816;

import enums.ValidationMessageType;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static leetcode.easy.truncate_sentence_1816.Solution.MAX_ALLOWED_LENGTH;
import static leetcode.easy.truncate_sentence_1816.Solution.MIN_ALLOWED_LENGTH;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_truncate_a_multiple_word_string_to_a_single_word() {
        String s = "Hello how are you Contestant";
        int k = 1;

        Assertions.assertEquals("Hello", solution.truncateSentence(s, k));
    }

    @Test
    public void input_string_is_returned_if_truncate_index_is_equal_to_the_count_of_words_in_the_string_input() {
        String s = "Hello how are you Contestant";
        int k = 5;

        Assertions.assertEquals(s, solution.truncateSentence(s, k));
    }

    @Test
    public void truncateSentence_throws_illegal_argument_exception_if_k_is_less_than_its_allowed_min_boundary() {
        String s = "Hello how are you Contestant";
        int k = 0;

        try {
            solution.truncateSentence(s, k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_ALLOWED_LENGTH, s.length()), e.getMessage());
        }
    }

    @Test
    public void truncateSentence_throws_illegal_argument_exception_if_k_is_more_than_its_allowed_max_boundary() {
        String s = "Hello how are you Contestant";
        int k = 6;

        try {
            solution.truncateSentence(s, k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_ALLOWED_LENGTH, s.length()), e.getMessage());
        }
    }

    @Test
    public void truncateSentence_throws_illegal_argument_exception_for_empty_input_string() {
        int k = 5;

        try {
            solution.truncateSentence("", k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_ALLOWED_LENGTH, MAX_ALLOWED_LENGTH), e.getMessage());
        }
    }

    @Test
    public void truncateSentence_throws_illegal_argument_exception_for_input_strings_with_length_bigger_than_the_max_allowed() {
        int k = 5;

        try {
            solution.truncateSentence(RandomStringUtils.randomAlphabetic(MAX_ALLOWED_LENGTH + 1), k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_ALLOWED_LENGTH, MAX_ALLOWED_LENGTH), e.getMessage());
        }
    }

    @Test
    public void truncateSentence_throws_null_pointer_exception_for_null_input_string() {
        int k = 5;

        try {
            solution.truncateSentence(null, k);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}