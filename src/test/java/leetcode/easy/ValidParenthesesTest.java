package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest extends BaseTest {
    private ValidParentheses validParentheses;

    @Test
    public void can_detect_valid_parentheses() {
        validParentheses = new ValidParentheses();

        String brackets = "{[()]}{}[()]";
        Assertions.assertTrue(validParentheses.isValid(brackets));
    }

    @Test
    public void can_detect_invalid_parentheses() {
        validParentheses = new ValidParentheses();

        String brackets = "{([)]}";
        Assertions.assertFalse(validParentheses.isValid(brackets));
    }
}
