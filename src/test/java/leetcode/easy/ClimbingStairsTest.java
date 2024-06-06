package leetcode.easy;

import enums.ValidationMessageType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest {
    private ClimbingStairs climbingStairsSolver;

    @BeforeEach
    public void setUp() {
        climbingStairsSolver = new ClimbingStairs();
    }

    @Test

    public void can_find_combination_for_a_single_stair() {
        int stairs = 1;
        assertEquals(1, climbingStairsSolver.climbStairs(stairs));
    }

    @Test
    public void can_find_combination_for_max_int() {
        int stairs = Integer.MAX_VALUE;
        assertEquals(2140540357, climbingStairsSolver.climbStairs(stairs));
    }

    @Test
    public void throws_illegal_argument_exception_for_non_positive_input() {
        int stairs = -10;
        try {
            climbingStairsSolver.climbStairs(stairs);
        } catch (IllegalArgumentException e) {
            assertEquals(ValidationMessageType.BELOW_MINIMUM_ERROR.getExceptionMessage(1), e.getMessage());
        }
    }
}
