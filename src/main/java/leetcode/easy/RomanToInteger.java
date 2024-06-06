package leetcode.easy;

import org.apache.commons.lang3.Validate;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;

// https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    public int romanToInt(String s) {
        Validate.notNull(s, NULL_VALUE_ERROR.getExceptionMessage());

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = getNumericValue(s.charAt(i));

            if (i != s.length() - 1) {
                int nextVal = getNumericValue(s.charAt(i + 1));

                if (currentVal < nextVal) {
                    result += nextVal - currentVal;
                    i++;
                    continue;
                }
            }
            result += currentVal;
        }
        return result;
    }

    private int getNumericValue(char romanNumeral) {
        Map<Character, Integer> romanNumeralsMap = new HashMap<>();
        romanNumeralsMap.put('I', 1);
        romanNumeralsMap.put('V', 5);
        romanNumeralsMap.put('X', 10);
        romanNumeralsMap.put('L', 50);
        romanNumeralsMap.put('C', 100);
        romanNumeralsMap.put('D', 500);
        romanNumeralsMap.put('M', 1000);

        if (romanNumeralsMap.get(romanNumeral) != null) {
            return romanNumeralsMap.get(romanNumeral);
        }
        throw new InvalidParameterException("Cannot find numeric value for: '" + romanNumeral + "'");
    }
}
