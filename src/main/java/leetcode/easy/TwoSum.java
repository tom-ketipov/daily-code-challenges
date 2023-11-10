package leetcode.easy;

// https://leetcode.com/problems/two-sum/
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1) {
            throw new IllegalArgumentException("Array length cannot be less than 2");
        }

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
