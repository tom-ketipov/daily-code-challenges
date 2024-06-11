package leetcode.easy.length_of_last_word_58;

import org.apache.commons.lang3.Validate;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;

// https://leetcode.com/problems/length-of-last-word/

public class Solution {
    public int lengthOfLastWord(String s) {
        Validate.notNull(s, NULL_VALUE_ERROR.getExceptionMessage());

        String[] arr = s.split(" ");
        return arr[arr.length - 1].trim().length();
    }
}
