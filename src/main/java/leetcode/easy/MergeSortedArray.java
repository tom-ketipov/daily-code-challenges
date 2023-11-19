package leetcode.easy;

import java.security.InvalidParameterException;
import java.util.Arrays;

// https://leetcode.com/problems/merge-sorted-array/
public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if (m <= 0) {
            throw new InvalidParameterException("Target array cannot be smaller than the secondary one.");
        }

        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[--n];
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
