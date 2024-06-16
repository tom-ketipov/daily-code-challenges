package leetcode.easy.minimum_number_game_2974;

// https://leetcode.com/problems/minimum-number-game/description/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.Arrays;

public class Solution {
    protected final static int MIN_ARR_LENGTH = 1;
    protected final static int MAX_ARR_LENGTH = 100;

    public int[] numberGame(int[] nums) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(MIN_ARR_LENGTH, MAX_ARR_LENGTH, nums.length,
                ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH));

        Validate.isTrue(nums.length % 2 == 0, ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage());

        Arrays.sort(nums);

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i += 2) {
            result[i] = nums[i + 1];
            result[i + 1] = nums[i];
        }
        return result;
    }
}
