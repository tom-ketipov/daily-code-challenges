package leetcode.easy;

import java.util.ArrayList;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveSortedArrDuplicates {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> distinct = new ArrayList<>();

        for (int num : nums) {
            if (!distinct.contains(num)) distinct.add(num);
        }

        nums = distinct.stream().mapToInt(i -> i).toArray();
        return nums.length;
    }
}
