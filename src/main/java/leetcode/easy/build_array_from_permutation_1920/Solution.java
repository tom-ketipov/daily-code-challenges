package leetcode.easy.build_array_from_permutation_1920;

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

// https://leetcode.com/problems/build-array-from-permutation/description/

public class Solution {

    public int getMaxArrayLength() {
        return 1000;
    }

    public int[] buildArray(int[] nums) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(0, getMaxArrayLength(), nums.length, ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(0, getMaxArrayLength()));

        int[] ans = new int[nums.length];
        int minValue = 0, maxValue = nums.length - 1;

        for (int i = 0; i < ans.length; i++) {
            Validate.inclusiveBetween(minValue, maxValue, nums[i], ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(minValue, maxValue));
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}