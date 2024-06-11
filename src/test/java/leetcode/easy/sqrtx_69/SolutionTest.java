package leetcode.easy.sqrtx_69;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private Solution sqrtXSolver;

    @BeforeEach
    public void setUp() {
        sqrtXSolver = new Solution();
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
