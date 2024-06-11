package leetcode.easy.valid_parentheses_20;

import org.apache.commons.lang3.Validate;

import java.util.Stack;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;

// https://leetcode.com/problems/valid-parentheses/
public class Solution {
    public boolean isValid(String s) {
        Validate.notNull(s, NULL_VALUE_ERROR.getExceptionMessage());

        // Validate 's' length
        if (s.length() % 2 == 1) return false;
        Stack<Character> bracketStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            switch (current) {
                case '(' -> bracketStack.push(')');
                case '[' -> bracketStack.push(']');
                case '{' -> bracketStack.push('}');
                default -> {
                    if (bracketStack.isEmpty() || bracketStack.pop() != current) {
                        return false;
                    }
                }
            }
        }
        return bracketStack.isEmpty();
    }
}
