package leetcode.easy;

import services.ValidationMessages;
import services.ValidationService;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FirstIndexOfOccurrenceInString {
    public int strStr(String haystack, String needle) {
        ValidationService.validateNotNull(haystack, ValidationMessages.NOT_NULL_ARRAY_EXCEPTION_MESSAGE);
        ValidationService.validateNotNull(needle, ValidationMessages.NOT_NULL_ARRAY_EXCEPTION_MESSAGE);

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
