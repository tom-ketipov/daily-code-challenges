package leetcode.easy.truncate_sentence_1816;

// https://leetcode.com/problems/truncate-sentence/description/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

public class Solution {
    protected final static int MIN_ALLOWED_LENGTH = 1;
    protected final static int MAX_ALLOWED_LENGTH = 500;

    public String truncateSentence(String s, int k) {
        Validate.notNull(s, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(MIN_ALLOWED_LENGTH, MAX_ALLOWED_LENGTH, s.length(),
                ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_ALLOWED_LENGTH, MAX_ALLOWED_LENGTH));

        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ");

        // validate that k is in allowed boundaries
        Validate.inclusiveBetween(MIN_ALLOWED_LENGTH, words.length, k,
                ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_ALLOWED_LENGTH, s.length()));

        for (int i = 0; i < k; i++) {
            if (!words[i].isEmpty()) {
                result.append(words[i]).append(" ");
            }
        }

        return result.toString().trim();
    }
}
