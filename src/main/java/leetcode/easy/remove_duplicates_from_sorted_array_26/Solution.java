package leetcode.easy.remove_duplicates_from_sorted_array_26;

import org.apache.commons.lang3.Validate;

import java.util.ArrayList;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class Solution {
    public int removeDuplicates(int[] nums) {
        Validate.notNull(nums, NULL_VALUE_ERROR.getExceptionMessage());

        ArrayList<Integer> distinct = new ArrayList<>();
        for (int num : nums) {
            if (!distinct.contains(num)) distinct.add(num);
        }
        nums = distinct.stream().mapToInt(i -> i).toArray();
        return nums.length;
    }
}
