package leetcode.easy.difference_between_element_sum_and_digit_sum_of_an_array_2535;

// https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

public class Solution {
    protected final static int MIN_VALUE = 1;
    protected final static int MAX_VALUE = 2000;

    public int differenceOfSum(int[] nums) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(MIN_VALUE, MAX_VALUE, nums.length,
                ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE));

        int arrSum = 0, digitSum = 0;
        for (int i = 0; i < nums.length; i++) {
            Validate.inclusiveBetween(MIN_VALUE, MAX_VALUE, nums.length,
                    ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE));

            int currentNumber = nums[i];

            arrSum += currentNumber;

            while (currentNumber > 0) {
                digitSum += currentNumber % 10;
                currentNumber /= 10;
            }
        }
        return Math.abs(arrSum - digitSum);
    }
}
