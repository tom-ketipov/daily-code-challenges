package leetcode.easy.check_if_two_string_arrays_are_equivalent_1662;

// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    protected final static int MIN_ARR_LENGTH = 1;
    protected final static int MAX_ARR_LENGTH = (int) Math.pow(10, 3);

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        Validate.notNull(word1, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.notNull(word2, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        Validate.inclusiveBetween(MIN_ARR_LENGTH, MAX_ARR_LENGTH, word1.length,
                ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH));
        Validate.inclusiveBetween(MIN_ARR_LENGTH, MAX_ARR_LENGTH, word2.length,
                ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH));

        return Arrays.stream(word1)
                .collect(Collectors.joining(""))
                .equals(Arrays.stream(word2)
                        .collect(Collectors.joining("")));
    }
}
