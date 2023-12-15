package leetcode.easy;

import services.ValidationMessages;
import services.ValidationService;

// https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        ValidationService.validateNotNull(nums, ValidationMessages.NOT_NULL_ARRAY_EXCEPTION_MESSAGE);

        int arrLength = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) return i;
        }
        return arrLength;
    }
}
