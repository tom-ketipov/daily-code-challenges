package leetcode.easy.create_target_array_in_the_given_order_1389;

// https://leetcode.com/problems/create-target-array-in-the-given-order/description/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] createTargetArray(int[] nums, int[] index) {
        Validate.notNull(nums, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.notNull(index, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        Validate.isTrue(nums.length == index.length, ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage());

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(index[i], nums[i]);
        }

        return result.stream()
                .mapToInt(Integer::intValue).toArray();
    }
}
