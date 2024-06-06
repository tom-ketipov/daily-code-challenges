package leetcode.easy;

import org.apache.commons.lang3.Validate;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

public class FirstIndexOfOccurrenceInString {
    public int strStr(String haystack, String needle) {
        Validate.notNull(haystack, NULL_VALUE_ERROR.getExceptionMessage());
        Validate.notNull(needle, NULL_VALUE_ERROR.getExceptionMessage());

        int haystackLength = haystack.length();
        int needleLength = needle.length();

        if (needleLength > haystackLength) return -1;

        for (int i = 0; i <= haystackLength - needleLength; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, haystackLength - (haystackLength - (i + needleLength))).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
