package leetcode.easy;

import services.ValidationMessages;
import services.ValidationService;

import java.security.InvalidParameterException;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/roman-to-integer/
public class RomanToInteger {
    public int romanToInt(String s) {
        ValidationService.validateNotNull(s, ValidationMessages.NOT_NULL_STRING_EXCEPTION_MESSAGE);

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
