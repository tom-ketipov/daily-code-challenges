package leetcode.easy;

import services.ValidationMessages;
import services.ValidationService;

//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        ValidationService.validateNotNull(nums, ValidationMessages.NOT_NULL_ARRAY_EXCEPTION_MESSAGE);

        int occurences = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = -1;
                occurences++;
            }
        }
        return occurences;
    }
}
