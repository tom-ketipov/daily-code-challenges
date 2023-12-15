package leetcode.easy;

import java.util.Arrays;

// https://leetcode.com/problems/longest-common-prefix/
public class LongestCommonPrefix {

    public String getLongestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs.length > 200) return "";

        StringBuilder prefix = new StringBuilder();
        int index = 0;
        while (strs[0].length() > index) {
            char character = strs[0].charAt(index);

            if (!isValidaCharacter(strs, index, character)) break;

            prefix.append(character);
            index++;
        }
        return prefix.toString();
    }

    private boolean isValidaCharacter(String[] strs, int index, char character) {
        return Arrays.stream(strs).allMatch(word -> word.length() > index && word.charAt(index) == character);
    }
}
