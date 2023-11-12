package leetcode.easy;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    public boolean isValid(String s) {
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
