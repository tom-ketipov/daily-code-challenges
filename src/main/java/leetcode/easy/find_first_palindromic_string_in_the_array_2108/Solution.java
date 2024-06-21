package leetcode.easy.find_first_palindromic_string_in_the_array_2108;

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

public class Solution {
    protected static final int MIN_ARR_LENGTH = 1;
    protected static final int MAX_ARR_LENGTH = 100;

    protected static final int MIN_WORD_LENGTH = 1;
    protected static final int MAX_WORD_LENGTH = 100;

    public String firstPalindrome(String[] words) {
        Validate.notNull(words, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(MIN_ARR_LENGTH, MAX_ARR_LENGTH, words.length,
                ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH));

        for (String word : words) {
            Validate.notNull(word, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
            Validate.inclusiveBetween(MIN_WORD_LENGTH, MAX_WORD_LENGTH, word.length(),
                    ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_WORD_LENGTH, MAX_WORD_LENGTH));

            StringBuilder reversedString = new StringBuilder();
            reversedString.append(word).reverse();

            if (word.equals(reversedString.toString())) return word;
        }
        return "";
    }
}
