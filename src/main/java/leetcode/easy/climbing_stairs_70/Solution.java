package leetcode.easy.climbing_stairs_70;

import org.apache.commons.lang3.Validate;

import static enums.ValidationMessageType.BELOW_MINIMUM_ERROR;

// https://leetcode.com/problems/climbing-stairs/

public class Solution {
    public int climb(int n) {
        Validate.isTrue(n >= 1, BELOW_MINIMUM_ERROR.getExceptionMessage(1));

        int a = 0, b = 1, sum = a + b;
        while (n-- >= 2) {
            a = b;
            b = sum;
            sum = a + b;
        }
        return sum;
    }
}