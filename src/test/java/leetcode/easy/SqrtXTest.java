package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtXTest {
    private SqrtX sqrtXSolver;

    @BeforeEach
    public void setUp() {
        sqrtXSolver = new SqrtX();
    }

    @Test
    public void sqrt_whole_results_are_returned_correctly() {
        int number = 4;
        assertEquals(2, sqrtXSolver.mySqrt(number));
    }

    @Test
    public void sqrt_decimal_results_are_floored_correctly_when_closer_to_upper_number() {
        int number = 8;
        assertEquals(2, sqrtXSolver.mySqrt(number));
    }

    @Test
    public void sqrt_decimal_results_are_rounded_correctly_when_closer_to_smaller_number() {
        int number = 6;
        assertEquals(2, sqrtXSolver.mySqrt(number));
    }
}
