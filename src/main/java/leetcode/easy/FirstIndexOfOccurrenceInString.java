package leetcode.easy;

// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
public class FirstIndexOfOccurrenceInString {
    public int strStr(String haystack, String needle) {
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
