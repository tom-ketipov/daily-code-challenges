package leetcode.easy.roman_to_integer_13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private Solution romanToInteger;

    @BeforeEach
    public void setUp() {
        romanToInteger = new Solution();
    }

    @Test
    public void can_convert_valid_roman_to_numeric_value() {
        String roman = "III";
        assertEquals(romanToInteger.romanToInt(roman), 3);
    }

    @Test
    public void can_convert_roman_to_numeric_value_for_subtraction_cases() {
        String roman = "MCMXCIV";
        assertEquals(romanToInteger.romanToInt(roman), 1994);
    }

    @Test
    public void cant_convert_invalid_roman_to_numeric_value() {
        String roman = "7h!s!s73s7";
        try {
            romanToInteger.romanToInt(roman);
        } catch (InvalidParameterException e) {
            assertEquals("Cannot find numeric value for: '7'", e.getMessage());
        }
    }

    @Test
    public void cant_convert_valid_lowercase_roman_to_numeric_value() {
        String roman = "vii";
        try {
            romanToInteger.romanToInt(roman);
        } catch (InvalidParameterException e) {
            assertEquals("Cannot find numeric value for: 'v'", e.getMessage());
        }
    }

    @Test
    public void can_convert_the_highest_roman_to_numeric_value() {
        String roman = "MMMCMXCIX";
        assertEquals(romanToInteger.romanToInt(roman), 3999);
    }
}