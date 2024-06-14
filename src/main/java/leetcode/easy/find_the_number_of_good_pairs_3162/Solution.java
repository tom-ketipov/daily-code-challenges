package leetcode.easy.find_the_number_of_good_pairs_3162;

// https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

public class Solution {

    public int getMinArrLength() {
        return 1;
    }

    public int getMaxArrLength() {
        return 50;
    }

    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        Validate.notNull(nums1, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.notNull(nums2, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        Validate.inclusiveBetween(getMinArrLength(), getMaxArrLength(), nums1.length,
                ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(getMinArrLength(), getMaxArrLength()));
        Validate.inclusiveBetween(getMinArrLength(), getMaxArrLength(), nums2.length,
                ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(getMinArrLength(), getMaxArrLength()));

        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] % (nums2[j] * k) == 0) count++;
            }
        }
        return count;
    }
}
