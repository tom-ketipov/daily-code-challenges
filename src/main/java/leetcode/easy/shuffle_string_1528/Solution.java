package leetcode.easy.shuffle_string_1528;

// https://leetcode.com/problems/shuffle-string/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

public class Solution {
    public String restoreString(String s, int[] indices) {
        Validate.notNull(s, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.notNull(indices, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        Validate.isTrue(indices.length == s.length(), ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage());

        char[] result = new char[s.length()];
        int currentIndex = 0;
        for (int index : indices) {
            Validate.inclusiveBetween(0, s.length() - 1, index,
                    ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(0, s.length() - 1));

            Validate.isTrue(result[index] == '\u0000', ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage());
            result[index] = s.charAt(currentIndex++);
        }

        return !String.valueOf(result).isEmpty() ? new String(result) : s;
    }
}
