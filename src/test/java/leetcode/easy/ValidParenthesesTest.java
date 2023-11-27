package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest extends BaseTest {
    private ValidParentheses validParentheses;

    @Test
    public void can_detect_valid_parentheses() {
        validParentheses = new ValidParentheses();

        String brackets = "{[()]}{}[()]";
        assertTrue(validParentheses.isValid(brackets));
    }

    @Test
    public void can_detect_invalid_parentheses() {
        validParentheses = new ValidParentheses();

        String brackets = "{([)]}";
        assertFalse(validParentheses.isValid(brackets));
    }
}
