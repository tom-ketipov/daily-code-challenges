package leetcode.easy.add_binary_67;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_add_two_binary_numbers() {
        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        Assertions.assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000", solution.add(a, b));
    }

    @Test
    public void add_method_throws_illegal_argument_exception_if_the_first_input_parameter_is_empty() {
        String a = "";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        try {
            solution.add(a, b);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.EMPTY_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void add_method_throws_illegal_argument_exception_if_the_second_input_parameter_is_empty() {
        String a = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";
        String b = "";

        try {
            solution.add(a, b);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.EMPTY_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void add_method_throws_null_pointer_exception_for_null_input_of_parameter_a() {
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        try {
            solution.add(null, b);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void add_method_throws_null_pointer_exception_for_null_input_of_parameter_b() {
        String a = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        try {
            solution.add(a, null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}
