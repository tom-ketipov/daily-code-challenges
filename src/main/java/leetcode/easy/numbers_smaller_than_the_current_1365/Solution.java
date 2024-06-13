package leetcode.easy.numbers_smaller_than_the_current_1365;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.Arrays;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        int[] result = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int smallerCount = 0;
            for (int j = nums.length-1 ; j >= 0; j--) {
                if (nums[j] < nums[i] && j != i) smallerCount++;
            }
            result[i] = smallerCount;
        }
        return result;
    }
}
