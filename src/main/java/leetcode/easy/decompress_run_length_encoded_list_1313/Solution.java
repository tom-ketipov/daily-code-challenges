package leetcode.easy.decompress_run_length_encoded_list_1313;

// https://leetcode.com/problems/decompress-run-length-encoded-list/description/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    protected final static int MIN_VALUE = 1;
    protected final static int MAX_VALUE = 100;
    protected final static int MAX_ARR_LENGTH = 100;
    protected final static int MIN_ARR_LENGTH = 2;

    public int[] decompressRLElist(int[] nums) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(MIN_ARR_LENGTH, MAX_ARR_LENGTH, nums.length,
                ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH));

        Validate.isTrue(nums.length % 2 == 0, ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage());

        List<Integer> decompressedNumsList = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            Validate.inclusiveBetween(MIN_VALUE, MAX_VALUE, nums[i],
                    ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE));

            Validate.inclusiveBetween(MIN_VALUE, MAX_VALUE, nums[i + 1],
                    ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE));

            while (nums[i] > 0) {
                decompressedNumsList.add(nums[i + 1]);
                nums[i]--;
            }
        }

        return decompressedNumsList.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
