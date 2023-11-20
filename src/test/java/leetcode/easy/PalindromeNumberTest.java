package leetcode.easy;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest extends BaseTest {
    private PalindromeNumber palindromeNumber;

    @Test
    public void can_produce_valid_check_for_palindrome_numbers() {
        palindromeNumber = new PalindromeNumber();

        int number = 22333322;
        Assert.assertTrue(palindromeNumber.isPalindrome(number));
    }

    @Test
    public void can_produce_valid_check_for_negative_numbers() {
        palindromeNumber = new PalindromeNumber();

        int number = -22333322;
        Assert.assertFalse(palindromeNumber.isPalindrome(number));
    }

    @Test
    public void can_produce_valid_check_for_one_digit_positive_numbers() {
        palindromeNumber = new PalindromeNumber();

        int number = 0;
        Assert.assertTrue(palindromeNumber.isPalindrome(number));
    }

    @Test
    public void can_produce_valid_check_for_one_digit_negative_numbers() {
        palindromeNumber = new PalindromeNumber();

        int number = -2;
        Assert.assertFalse(palindromeNumber.isPalindrome(number));
    }
}
