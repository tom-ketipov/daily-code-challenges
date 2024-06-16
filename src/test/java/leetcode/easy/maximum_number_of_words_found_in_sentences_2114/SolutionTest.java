package leetcode.easy.maximum_number_of_words_found_in_sentences_2114;

import enums.ValidationMessageType;
import org.apache.commons.lang3.RandomStringUtils;
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
    public void can_find_maximum_number_of_words_in_multi_element_array_with_one_max_word_sentence() {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great, thanks very much"};

        Assertions.assertEquals(6, solution.mostWordsFound(sentences));
    }

    @Test
    public void can_find_maximum_number_of_words_in_multi_element_array_with_multiple_max_word_sentences_of_equal_length() {
        String[] sentences = {"Lorem ipsum", "Lorem ipsum dolor", "Lorem ipsum", "Lorem ipsum dolor", "Lorem ipsum"};

        Assertions.assertEquals(3, solution.mostWordsFound(sentences));
    }

    @Test
    public void mostWordsFound_throws_null_pointer_exception_for_if_there_is_an_element_longer_than_one_hundred_symbols() {
        try {
            solution.mostWordsFound(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void mostWordsFound_throws_illegal_argument_exception_for_input_array_with_length_bigger_than_one_hundred() {

        try {
            solution.mostWordsFound(new String[101]);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(solution.getMinValue(), solution.getMaxValue()), e.getMessage());
        }
    }

    @Test
    public void mostWordsFound_throws_illegal_argument_exception_for_empty_input_array() {

        try {
            solution.mostWordsFound(new String[0]);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(solution.getMinValue(), solution.getMaxValue()), e.getMessage());
        }
    }

    @Test
    public void mostWordsFound_throws_illegal_argument_exception_if_there_is_an_element_longer_than_one_hundred_symbols() {
        String[] sentences = {RandomStringUtils.randomAlphabetic(101), "Lorem"};

        try {
            solution.mostWordsFound(sentences);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void mostWordsFound_throws_illegal_argument_exception_if_there_is_an_element_with_multiple_consecutive_spaces() {
        String[] sentences = {"Testing", "Lorem ipsum  dolor", "Lorem ipsum"};


        try {
            solution.mostWordsFound(sentences);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void mostWordsFound_throws_illegal_argument_exception_if_there_is_an_element_with_leading_spaces() {
        String[] sentences = {"Testing", " Lorem ipsum dolor", "Lorem ipsum"};


        try {
            solution.mostWordsFound(sentences);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void mostWordsFound_throws_illegal_argument_exception_if_there_is_an_element_with_trailing_spaces() {
        String[] sentences = {"Testing", "Lorem ipsum dolor", "Lorem ipsum "};


        try {
            solution.mostWordsFound(sentences);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}