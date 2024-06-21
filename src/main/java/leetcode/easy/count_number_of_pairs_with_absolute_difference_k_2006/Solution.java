package leetcode.easy.count_number_of_pairs_with_absolute_difference_k_2006;

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/

public class Solution {
    protected final static int MIN_ARR_LENGTH = 2;
    protected final static int MAX_ARR_LENGTH = 200;

    protected final static int MIN_VALUE = 1;
    protected final static int MAX_VALUE = 100;

    protected final static int MIN_DIFF = 1;
    protected final static int MAX_DIFF = 50;

    public int countKDifference(int[] nums, int k) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(MIN_ARR_LENGTH, MAX_ARR_LENGTH, nums.length,
                ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH));

        Validate.inclusiveBetween(MIN_DIFF, MAX_DIFF, k,
                ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_DIFF, MAX_DIFF));

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int primaryNum = nums[i];

            Validate.inclusiveBetween(MIN_VALUE, MAX_VALUE, primaryNum,
                    ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE));

            for (int j = i + 1; j < nums.length; j++) {
                int secondaryNum = nums[j];

                if (Math.abs(primaryNum - secondaryNum) == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
