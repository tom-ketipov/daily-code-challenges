package leetcode.easy;

import services.ValidationMessages;
import services.ValidationService;

// https://leetcode.com/problems/length-of-last-word/
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        ValidationService.validateNotNull(s, ValidationMessages.NOT_NULL_STRING_EXCEPTION_MESSAGE);

        String[] arr = s.split(" ");
        return arr[arr.length - 1].trim().length();
    }
}
