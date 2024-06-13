package leetcode.easy.running_sum_of_one_dimensional_array_1480;

// https://leetcode.com/problems/running-sum-of-1d-array/description/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

public class Solution {
    public int[] runningSum(int[] nums) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}
