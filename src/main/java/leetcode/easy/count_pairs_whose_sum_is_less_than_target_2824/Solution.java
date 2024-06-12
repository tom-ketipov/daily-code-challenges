package leetcode.easy.count_pairs_whose_sum_is_less_than_target_2824;

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.List;

// https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/

public class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        int pairsCount = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (i == j) continue;

                if (nums.get(i) + nums.get(j) < target) pairsCount++;
            }
        }
        return pairsCount;
    }
}
