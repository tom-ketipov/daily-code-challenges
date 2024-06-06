package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PlusOneTest {
    private PlusOne plusOneSolver;

    @BeforeEach
    public void setUp() {
        plusOneSolver = new PlusOne();
    }

    @Test
    public void can_increment_last_digit_only() {
        int[] arr = {2, 5, 3, 1};
        assertArrayEquals(new int[]{2, 5, 3, 2}, plusOneSolver.plusOne(arr));
    }

    @Test
    public void can_increment_multiple_elements_without_arr_length_modification() {
        int[] arr = {2, 5, 9, 9};
        assertArrayEquals(new int[]{2, 6, 0, 0}, plusOneSolver.plusOne(arr));
    }

    @Test
    public void can_modify_arr_length_upon_incrementation() {
        int[] arr = {9, 9, 9, 9};
        assertArrayEquals(new int[]{1, 0, 0, 0, 0}, plusOneSolver.plusOne(arr));
    }
}
