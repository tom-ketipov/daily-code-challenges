package leetcode.easy.minimum_operations_to_exceed_threshold_value_3065;

// https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/description/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.Arrays;

public class Solution {
    public int minOperations(int[] nums, int k) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        Arrays.sort(nums);

        int left = 0, right = nums.length - 1, result = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == k) {
                result = mid;
                right = mid - 1;
            }

            if (k < nums[mid]) right = mid - 1;
            if (k > nums[mid]) left = mid + 1;

            if (left > right) return left;
        }
        return result;
    }
}
