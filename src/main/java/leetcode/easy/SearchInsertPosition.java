package leetcode.easy;

import org.apache.commons.lang3.Validate;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;

// https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        Validate.notNull(nums, NULL_VALUE_ERROR.getExceptionMessage());

        int arrLength = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) return i;
        }
        return arrLength;
    }
}
