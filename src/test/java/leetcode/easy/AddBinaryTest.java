package leetcode.easy;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class AddBinaryTest extends BaseTest {
    private AddBinary addBinarySolver;

    @Test
    public void can_add_two_binary_numbers() {
        addBinarySolver = new AddBinary();

        String binaryValueA = "1010";
        String binaryValueB = "1011";

        Assert.assertEquals("10101", addBinarySolver.addBinary(binaryValueA, binaryValueB));
    }

    @Test
    public void can_handle_long_type_numbers() {
        addBinarySolver = new AddBinary();

        String binaryValueA = "10000000000000000000000010000001";
        String binaryValueB = "10100000000000000000000010011100100";

        Assert.assertEquals("10110000000000000000000010101100101", addBinarySolver.addBinary(binaryValueA, binaryValueB));
    }

    @Test
    public void can_handle_bin_integer_type_numbers() {
        addBinarySolver = new AddBinary();

        String binaryValueA = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String binaryValueB = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        Assert.assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000", addBinarySolver.addBinary(binaryValueA, binaryValueB));
    }
}
