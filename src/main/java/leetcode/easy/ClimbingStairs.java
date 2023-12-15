package leetcode.easy;

import services.ValidationMessages;
import services.ValidationService;

// https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public int climbStairs(int n) {
        ValidationService.validateInRange(n, 1, Integer.MAX_VALUE, ValidationMessages.NOT_POSITIVE_NUMBER_EXCEPTION_MESSAGE);

        int a = 0, b = 1, sum = a + b;
        while (n-- >= 2) {
            a = b;
            b = sum;
            sum = a + b;
        }
        return sum;
    }
}
