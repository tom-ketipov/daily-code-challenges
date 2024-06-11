package leetcode.easy.valid_palindrome_125;

import org.apache.commons.lang3.Validate;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;

/*
        Valid Palindrome problem
        https://leetcode.com/problems/valid-palindrome/
        =====================================================>
        Time Complexity: O(n)
 */
public class Solution {
    public boolean isPalindrome(String s) {
        Validate.notNull(s, NULL_VALUE_ERROR.getExceptionMessage());

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
