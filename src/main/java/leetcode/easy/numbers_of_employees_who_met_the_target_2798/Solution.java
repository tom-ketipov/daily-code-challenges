package leetcode.easy.numbers_of_employees_who_met_the_target_2798;

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.Arrays;

// https://leetcode.com/problems/number-of-employees-who-met-the-target/submissions/1285138470/

public class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        Validate.notNull(hours, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        Arrays.sort(hours);

        int left = 0, right = hours.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (hours[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return hours.length - left;
    }
}