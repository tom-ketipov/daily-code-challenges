package leetcode.easy;
import java.util.Arrays;

//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
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
