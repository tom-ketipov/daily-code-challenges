package leetcode.easy.sum_of_values_at_indices_with_k_set_bits_2859;

// https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.List;

public class Solution {
    public int getMinListLength() {
        return 1;
    }

    public int getMaxListLength() {
        return 1000;
    }

    public int getMinKSetValue() {
        return 1;
    }

    public int getMaxKSetValue() {
        return 10;
    }

    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(getMinListLength(), getMaxListLength(), nums.size(),
                ValidationMessageType.OUT_OF_RANGE_ARRAY_LIST_LENGTH_ERROR.getExceptionMessage(getMinListLength(), getMaxListLength()));

        Validate.inclusiveBetween(getMinKSetValue(), getMaxKSetValue(), k,
                ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(getMinKSetValue(), getMaxKSetValue()));

        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (getSetIndexCount(Integer.toBinaryString(i)) == k) sum += nums.get(i);
        }
        return sum;
    }

    private int getSetIndexCount(String binaryNum) {
        return binaryNum.replaceAll("0", "").length();
    }
}
