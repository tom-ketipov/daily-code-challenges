package leetcode.easy.palindrome_number_9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    private Solution palindromeNumber;

    @BeforeEach
    public void setUp() {
        palindromeNumber = new Solution();
    }

    @Test
    public void can_produce_valid_check_for_palindrome_numbers() {
        int number = 22333322;
        assertTrue(palindromeNumber.isPalindrome(number));
    }

    @Test
    public void can_produce_valid_check_for_negative_numbers() {
        int number = -22333322;
        assertFalse(palindromeNumber.isPalindrome(number));
    }

    @Test
    public void can_produce_valid_check_for_one_digit_positive_numbers() {
        int number = 0;
        assertTrue(palindromeNumber.isPalindrome(number));
    }

    @Test
    public void can_produce_valid_check_for_one_digit_negative_numbers() {
        int number = -2;
        assertFalse(palindromeNumber.isPalindrome(number));
    }
}