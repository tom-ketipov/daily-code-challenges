package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SqrtXTest extends BaseTest {
    private SqrtX sqrtXSolver;

    @Test
    public void sqrt_whole_results_are_returned_correctly() {
        sqrtXSolver = new SqrtX();

        int number = 4;
        assertEquals(2, sqrtXSolver.mySqrt(number));
    }

    @Test
    public void sqrt_decimal_results_are_floored_correctly_when_closer_to_upper_number() {
        sqrtXSolver = new SqrtX();

        int number = 8;
        assertEquals(2, sqrtXSolver.mySqrt(number));
    }

    @Test
    public void sqrt_decimal_results_are_rounded_correctly_when_closer_to_smaller_number() {
        sqrtXSolver = new SqrtX();

        int number = 6;
        assertEquals(2, sqrtXSolver.mySqrt(number));
    }
}
