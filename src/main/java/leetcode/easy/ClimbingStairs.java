package leetcode.easy;

import java.security.InvalidParameterException;

// https://leetcode.com/problems/climbing-stairs/
public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n <= 0) {
            throw new InvalidParameterException("Number of stairs must be >= 1.");
        }
        int a = 0, b = 1, sum = a + b;
        while (n-- >= 2) {
            a = b;
            b = sum;
            sum = a + b;
        }
        return sum;
    }
}
