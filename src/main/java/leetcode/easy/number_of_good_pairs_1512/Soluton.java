package leetcode.easy.number_of_good_pairs_1512;

// https://leetcode.com/problems/number-of-good-pairs/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

public class Soluton {

    public int numIdenticalPairs(int[] nums) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        int pairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
