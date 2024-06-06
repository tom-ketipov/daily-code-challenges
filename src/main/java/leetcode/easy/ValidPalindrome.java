package leetcode.easy;

import org.apache.commons.lang3.Validate;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;

/*
        Valid Palindrome problem
        https://leetcode.com/problems/valid-palindrome/
        =====================================================>
        Time Complexity: O(n)
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        Validate.notNull(s, NULL_VALUE_ERROR.getExceptionMessage());

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
