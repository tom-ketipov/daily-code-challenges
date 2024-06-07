package leetcode.easy;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClimbingStairsSolverTest {
    private ClimbingStairsSolver climbingStairsSolver;

    @BeforeEach
    public void setUp() {
        climbingStairsSolver = new ClimbingStairsSolver();
    }

    @Test

    public void can_find_combination_for_a_single_stair() {
        int stairs = 1;
        Assertions.assertEquals(1, climbingStairsSolver.climb(stairs));
    }

    @Test
    public void can_find_combination_for_max_int() {
        int stairs = Integer.MAX_VALUE;
        Assertions.assertEquals(2140540357, climbingStairsSolver.climb(stairs));
    }

    @Test
    public void climb_method_throws_illegal_argument_exception_for_non_positive_input() {
        int stairs = -10;
        try {
            climbingStairsSolver.climb(stairs);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.BELOW_MINIMUM_ERROR.getExceptionMessage(1), e.getMessage());
        }
    }
}
