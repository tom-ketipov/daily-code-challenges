package leetcode.easy;

import core.BaseTest;

import org.junit.jupiter.api.Test;
import services.ValidationMessages;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingStairsTest extends BaseTest {
    private ClimbingStairs climbingStairsSolver;

    @Test

    public void can_find_combination_for_a_single_stair() {
        climbingStairsSolver = new ClimbingStairs();

        int stairs = 1;
        assertEquals(1, climbingStairsSolver.climbStairs(stairs));
    }

    @Test
    public void can_find_combination_for_smaller_stairs_size() {
        climbingStairsSolver = new ClimbingStairs();

        int stairs = 3;
        assertEquals(3, climbingStairsSolver.climbStairs(stairs));
    }

    @Test
    public void can_find_combination_for_bigger_stairs_size() {
        climbingStairsSolver = new ClimbingStairs();

        int stairs = 10;
        assertEquals(89, climbingStairsSolver.climbStairs(stairs));
    }

    @Test
    public void throws_exception_for_invalid_parameters() {
        climbingStairsSolver = new ClimbingStairs();

        int stairs = -10;
        try {
            climbingStairsSolver.climbStairs(stairs);
        } catch (IllegalArgumentException e) {
            assertEquals(ValidationMessages.NOT_POSITIVE_NUMBER_EXCEPTION_MESSAGE, e.getMessage());
        }
    }
}
