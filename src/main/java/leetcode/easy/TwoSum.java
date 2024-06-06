package leetcode.easy;

import org.apache.commons.lang3.Validate;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Validate.notNull(nums, NULL_VALUE_ERROR.getExceptionMessage());

        int[] additionIndexes = {-1, -1};
        boolean found = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;

                if (target - nums[i] == nums[j]) {
                    additionIndexes[0] = i;
                    additionIndexes[1] = j;
                    found = true;
                    break;
                }
            }
            if (found) break;
        }

        return additionIndexes;
    }
}
