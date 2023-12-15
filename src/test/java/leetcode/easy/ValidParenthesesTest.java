package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest extends BaseTest {
    private ValidParentheses validParentheses;

    @BeforeEach
    public void setUp() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void can_detect_valid_parentheses() {
        String brackets = "{[()]}{}[()]";
        assertTrue(validParentheses.isValid(brackets));
    }

    @Test
    public void can_detect_invalid_parentheses() {
        String brackets = "{([)]}";
        assertFalse(validParentheses.isValid(brackets));
    }
}
