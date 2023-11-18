package leetcode.easy;

// https://leetcode.com/problems/search-insert-position/description/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int arrLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (target <= nums[i]) return i;
        }

        return arrLength;
    }
}
