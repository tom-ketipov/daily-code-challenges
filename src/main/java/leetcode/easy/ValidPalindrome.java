package leetcode.easy;

/*
        Valid Palindrome problem
        https://leetcode.com/problems/valid-palindrome/
        =====================================================>
        Time Complexity: O(n)
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        // Validate input parameter
        if (s == null) {
            throw new IllegalArgumentException("Input cannot be null.");
        }

        s = s.replaceAll("[^a-zA-Z0-9]", "");
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
