package leetcode.easy.find_variable_value_after_performing_operations_2011;

// https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

public class Solution {

    public int finalValueAfterOperations(String[] operations) {
        Validate.notNull(operations, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        int value = 0;
        for (String operation : operations) {
            switch (operation) {
                case "++X", "X++" -> value++;
                case "--X", "X--" -> value--;
                default -> throw new IllegalArgumentException(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage());
            }
        }
        return value;
    }
}
