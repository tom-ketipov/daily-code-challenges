package leetcode.easy;

import services.ValidationMessages;
import services.ValidationService;

import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        ValidationService.validateNotNull(nums1, ValidationMessages.NOT_NULL_ARRAY_EXCEPTION_MESSAGE);
        ValidationService.validateNotNull(nums2, ValidationMessages.NOT_NULL_ARRAY_EXCEPTION_MESSAGE);
        ValidationService.validateInRange(m, 0, (nums1.length - n), ValidationMessages.NOT_IN_RANGE_EXCEPTION_MESSAGE);

        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[--n];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
