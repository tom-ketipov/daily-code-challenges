package leetcode.easy;

import services.ValidationMessages;
import services.ValidationService;

/*
        Valid Palindrome problem
        https://leetcode.com/problems/valid-palindrome/
        =====================================================>
        Time Complexity: O(n)
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        ValidationService.validateNotNull(s, ValidationMessages.NOT_NULL_STRING_EXCEPTION_MESSAGE);

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
