package leetcode.easy.valid_palindrome_125;

import enums.ValidationMessageType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution validPalindromeSolver;

    @BeforeEach
    public void setUp() {
        validPalindromeSolver = new Solution();
    }

    @Test
    public void can_detect_valid_palindrome() {
        String s = "A man, a plan, a canal: Panama";
        assertTrue(validPalindromeSolver.isPalindrome(s));
    }

    @Test
    public void can_detect_a_non_palindrome() {
        String s = "0P";
        assertFalse(validPalindromeSolver.isPalindrome(s));
    }

    @Test
    public void returns_true_for_single_character_inputs() {
        String s = "a";
        assertTrue(validPalindromeSolver.isPalindrome(s));
    }

    @Test
    public void returns_true_for_empty_inputs() {
        String s = "";
        assertTrue(validPalindromeSolver.isPalindrome(s));
    }

    @Test
    public void isPalindrome_throws_null_pointer_exception_for_null_inputs() {
        try {
            assertTrue(validPalindromeSolver.isPalindrome(null));
        } catch (NullPointerException e) {
            assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}