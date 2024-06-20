package leetcode.easy.number_of_arithmetic_triplets_2367;

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

// https://leetcode.com/problems/number-of-arithmetic-triplets/

public class Solution {
    protected final static int MIN_DIFF = 1;
    protected final static int MAX_DIFF = 50;

    protected final static int MIN_VALUE = 0;
    protected final static int MAX_VALUE = 200;

    protected final static int MIN_ARR_LENGTH = 3;
    protected final static int MAX_ARR_LENGTH = 200;

    public int arithmeticTriplets(int[] nums, int diff) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(MIN_ARR_LENGTH, MAX_ARR_LENGTH, nums.length,
                ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH));

        Validate.inclusiveBetween(MIN_DIFF, MAX_DIFF, diff,
                ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_DIFF, MAX_DIFF));

        Map<Integer, Integer> arithmeticMap = new HashMap<>();
        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            Validate.inclusiveBetween(MIN_VALUE, MAX_VALUE, num,
                    ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE));

            numSet.add(num);
            arithmeticMap.put(num - diff, num + diff);
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : arithmeticMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (numSet.contains(key) && numSet.contains(value)) count++;
        }

        return count;
    }
}
