package leetcode.easy.left_and_right_sum_differences_2574;

// https://leetcode.com/problems/left-and-right-sum-differences/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

public class Solution {
    public static final int MIN_ARR_LENGTH = 1;
    public static final int MAX_ARR_LENGTH = 1000;

    public int[] leftRightDifference(int[] nums) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(MIN_ARR_LENGTH, MAX_ARR_LENGTH, nums.length,
                ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH));

        int[] result = new int[nums.length];

        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < nums.length; i++) {
            result[result.length - 1 - i] = Math.abs(result[result.length - 1 - i] - rightSum);
            rightSum += nums[nums.length - 1 - i];

            result[i] = Math.abs(leftSum - result[i]);
            leftSum += nums[i];
        }
        return result;
    }
}
