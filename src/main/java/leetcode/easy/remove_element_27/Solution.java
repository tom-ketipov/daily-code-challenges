package leetcode.easy.remove_element_27;

import org.apache.commons.lang3.Validate;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;

//https://leetcode.com/problems/remove-element/
public class Solution {
    public int removeElement(int[] nums, int val) {
        Validate.notNull(nums, NULL_VALUE_ERROR.getExceptionMessage());

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
