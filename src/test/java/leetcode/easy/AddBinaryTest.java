package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AddBinaryTest {
    private AddBinary addBinarySolver;

    @BeforeEach
    public void setUp() {
        addBinarySolver = new AddBinary();
    }

    @Test
    public void can_add_two_binary_numbers() {
        String binaryValueA = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String binaryValueB = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000", addBinarySolver.addBinary(binaryValueA, binaryValueB));
    }
}
