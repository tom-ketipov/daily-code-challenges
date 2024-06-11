package leetcode.easy.palindrome_number_9;

//https://leetcode.com/problems/palindrome-number/
public class Solution {
    public boolean isPalindrome(int x) {
        if (x >= 0 && x < 10) return true;
        if(x < 0) return false;

        long original = x;
        long reversed = 0;

        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        return reversed == original;
    }
}
