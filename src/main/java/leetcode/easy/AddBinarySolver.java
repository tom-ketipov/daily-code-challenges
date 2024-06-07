package leetcode.easy;

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.math.BigInteger;

// https://leetcode.com/problems/add-binary/

public class AddBinarySolver {
    public String add(String a, String b) {
        // Validate that the input parameters are not nulls
        Validate.notNull(a, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.notNull(b, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        // Validate that the input parameters are not empty
        Validate.notEmpty(a, ValidationMessageType.EMPTY_VALUE_ERROR.getExceptionMessage());
        Validate.notEmpty(b, ValidationMessageType.EMPTY_VALUE_ERROR.getExceptionMessage());

        return (new BigInteger(a, 2).add(new BigInteger(b, 2))).toString(2);
    }
}
