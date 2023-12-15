package leetcode.easy;

import org.junit.jupiter.api.Test;
import services.ValidationMessages;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    private ValidPalindrome validPalindromeSolver;

    @Test
    public void can_detect_valid_palindrome() {
        validPalindromeSolver = new ValidPalindrome();

        String s = "A man, a plan, a canal: Panama";
        assertTrue(validPalindromeSolver.isPalindrome(s));
    }

    @Test
    public void can_detect_a_non_palindrome() {
        validPalindromeSolver = new ValidPalindrome();

        String s = "0P";
        assertFalse(validPalindromeSolver.isPalindrome(s));
    }

    @Test
    public void returns_true_for_single_character_inputs() {
        validPalindromeSolver = new ValidPalindrome();

        String s = "a";
        assertTrue(validPalindromeSolver.isPalindrome(s));
    }

    @Test
    public void returns_true_for_empty_inputs() {
        validPalindromeSolver = new ValidPalindrome();

        String s = "";
        assertTrue(validPalindromeSolver.isPalindrome(s));
    }

    @Test
    public void throws_exception_for_null_inputs() {
        validPalindromeSolver = new ValidPalindrome();

        try {
            assertTrue(validPalindromeSolver.isPalindrome(null));
        } catch (IllegalArgumentException e) {
            assertEquals(ValidationMessages.NOT_NULL_STRING_EXCEPTION_MESSAGE, e.getMessage());
        }
    }
}