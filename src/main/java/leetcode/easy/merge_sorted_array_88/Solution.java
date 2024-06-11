package leetcode.easy.merge_sorted_array_88;

import org.apache.commons.lang3.Validate;

import java.util.Arrays;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;
import static enums.ValidationMessageType.OUT_OF_RANGE_ERROR;

// https://leetcode.com/problems/merge-sorted-array/
public class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        Validate.notNull(nums1, NULL_VALUE_ERROR.getExceptionMessage());
        Validate.notNull(nums2, NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(0, nums1.length - n, m, OUT_OF_RANGE_ERROR.getExceptionMessage(0, nums1.length - n)); // todo -> double-check the validation for 'm'

        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[--n];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
