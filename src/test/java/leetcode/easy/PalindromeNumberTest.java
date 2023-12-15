package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeNumberTest extends BaseTest {
    private PalindromeNumber palindromeNumber;

    @Test
    public void can_produce_valid_check_for_palindrome_numbers() {
        palindromeNumber = new PalindromeNumber();

        int number = 22333322;
        assertTrue(palindromeNumber.isPalindrome(number));
    }

    @Test
    public void can_produce_valid_check_for_negative_numbers() {
        palindromeNumber = new PalindromeNumber();

        int number = -22333322;
        assertFalse(palindromeNumber.isPalindrome(number));
    }

    @Test
    public void can_produce_valid_check_for_one_digit_positive_numbers() {
        palindromeNumber = new PalindromeNumber();

        int number = 0;
        assertTrue(palindromeNumber.isPalindrome(number));
    }

    @Test
    public void can_produce_valid_check_for_one_digit_negative_numbers() {
        palindromeNumber = new PalindromeNumber();

        int number = -2;
        assertFalse(palindromeNumber.isPalindrome(number));
    }
}
