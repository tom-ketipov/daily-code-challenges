package leetcode.easy.concatenation_of_array_1929;

// https://leetcode.com/problems/concatenation-of-array/description/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

public class Solution {
    public int[] getConcatenation(int[] nums) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(1, 1000, nums.length, ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(1, 1000));

        int[] ans = new int[nums.length * 2];

        System.arraycopy(nums, 0, ans, 0, nums.length);
        System.arraycopy(nums, 0, ans, nums.length, nums.length);

        return ans;
    }
}
