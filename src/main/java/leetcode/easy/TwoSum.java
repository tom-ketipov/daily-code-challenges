package leetcode.easy;

import services.ValidationMessages;
import services.ValidationService;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        ValidationService.validateNotNull(nums, ValidationMessages.NOT_NULL_ARRAY_EXCEPTION_MESSAGE);
        ValidationService.validateArrayLengthInRange(nums, 2, Integer.MAX_VALUE, ValidationMessages.NOT_VALID_ARRAY_LENGTH_EXCEPTION_MESSAGE);

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
