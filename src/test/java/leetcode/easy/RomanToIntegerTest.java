package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

public class RomanToIntegerTest extends BaseTest {
    private RomanToInteger romanToInteger;

    @Test
    public void can_convert_valid_roman_to_numeric_value() {
        romanToInteger = new RomanToInteger();

        String roman = "III";
        Assertions.assertEquals(romanToInteger.romanToInt(roman), 3);
    }

    @Test
    public void can_convert_roman_to_numeric_value_for_subtraction_cases() {
        romanToInteger = new RomanToInteger();

        String roman = "MCMXCIV";
        Assertions.assertEquals(romanToInteger.romanToInt(roman), 1994);
    }

    @Test
    public void cant_convert_invalid_roman_to_numeric_value() {
        romanToInteger = new RomanToInteger();

        String roman = "7h!s!s73s7";
        try {
            romanToInteger.romanToInt(roman);
        } catch (InvalidParameterException e) {
            Assertions.assertEquals("Cannot find numeric value for: '7'", e.getMessage());
        }
    }

    @Test
    public void cant_convert_valid_lowercase_roman_to_numeric_value() {
        romanToInteger = new RomanToInteger();

        String roman = "vii";
        try {
            romanToInteger.romanToInt(roman);
        } catch (InvalidParameterException e) {
            Assertions.assertEquals("Cannot find numeric value for: 'v'", e.getMessage());
        }
    }

    @Test
    public void can_convert_the_highest_roman_to_numeric_value() {
        romanToInteger = new RomanToInteger();

        String roman = "MMMCMXCIX";
        Assertions.assertEquals(romanToInteger.romanToInt(roman), 3999);
    }
}
