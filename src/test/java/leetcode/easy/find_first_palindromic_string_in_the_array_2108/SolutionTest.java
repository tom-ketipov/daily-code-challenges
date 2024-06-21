package leetcode.easy.find_first_palindromic_string_in_the_array_2108;

import enums.ValidationMessageType;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static leetcode.easy.find_first_palindromic_string_in_the_array_2108.Solution.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_detect_first_palindromic_string__in_array_with_only_lowercase_values() {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};

        Assertions.assertEquals(words[2], solution.firstPalindrome(words));
    }

    @Test
    public void firstPalindrome_returns_empty_string_if_no_palindrome_is_found() {
        String[] words = {"abc", "car", "adA", "cool"};

        Assertions.assertEquals("", solution.firstPalindrome(words));
    }

    @Test
    public void firstPalindrome_is_case_sensitive() {
        String[] words = {"abc", "car", "adA", "racecar", "cool"};

        Assertions.assertEquals(words[3], solution.firstPalindrome(words));
    }

    @Test
    public void firstPalindrome_throws_illegal_argument_exception_for_array_length_bigger_than_allowed_maximum() {
        int length = MAX_ARR_LENGTH + 1;
        String[] words = new String[length];

        while (length > 0) {
            words[length - 1] = RandomStringUtils.randomAlphabetic(MIN_WORD_LENGTH, MAX_WORD_LENGTH);
            length--;
        }

        try {
            solution.firstPalindrome(words);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH),
                    e.getMessage());
        }
    }

    @Test
    public void firstPalindrome_throws_illegal_argument_exception_for_array_length_smaller_than_allowed_minimum() {
        try {
            solution.firstPalindrome(new String[]{});
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH),
                    e.getMessage());
        }
    }

    @Test
    public void firstPalindrome_throws_null_pointer_exception_for_null_entry_in_the_input_array() {
        try {
            solution.firstPalindrome(new String[]{"car", "two", null});
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }


    @Test
    public void firstPalindrome_throws_illegal_argument_exception_for_words_longer_than_allowed_maximum() {
        try {
            solution.firstPalindrome(new String[]{RandomStringUtils.randomAlphabetic(MAX_WORD_LENGTH + 1)});
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_WORD_LENGTH, MAX_WORD_LENGTH),
                    e.getMessage());
        }
    }

    @Test
    public void firstPalindrome_throws_illegal_argument_exception_for_words_shorter_than_allowed_minimum() {
        try {
            solution.firstPalindrome(new String[]{""});
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_WORD_LENGTH, MAX_WORD_LENGTH),
                    e.getMessage());
        }
    }

    @Test
    public void firstPalindrome_throws_null_pointer_exception_for_null_input() {
        try {
            solution.firstPalindrome(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}