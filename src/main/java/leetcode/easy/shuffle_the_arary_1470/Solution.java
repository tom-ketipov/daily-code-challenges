package leetcode.easy.shuffle_the_arary_1470;

// https://leetcode.com/problems/shuffle-the-array/description/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(1, Integer.MAX_VALUE, nums.length, ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(1, Integer.MAX_VALUE));
        Validate.inclusiveBetween(0, nums.length - 1, n, ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(0, nums.length - 1));

        int[] shiftedArr = new int[nums.length];
        int left = 0, right = n;

        for (int i = 0; i < shiftedArr.length; i++) {
            if (right >= nums.length) {
                System.arraycopy(nums, left, shiftedArr, i, n - left);
                break;
            }

            if (left >= n) {
                System.arraycopy(nums, right, shiftedArr, i, nums.length - right);
                break;
            }

            if (i % 2 == 0) {
                shiftedArr[i] = nums[left++];
            } else {
                shiftedArr[i] = nums[right++];
            }
        }

        return shiftedArr;
    }
}
