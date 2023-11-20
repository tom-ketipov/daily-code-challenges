package leetcode.easy;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

import java.security.InvalidParameterException;

public class ClimbingStairsTest extends BaseTest {
    private ClimbingStairs climbingStairsSolver;

    @Test
    public void can_find_combination_for_a_single_stair() {
        climbingStairsSolver = new ClimbingStairs();

        int stairs = 1;
        Assert.assertEquals(1, climbingStairsSolver.climbStairs(stairs));
    }

    @Test
    public void can_find_combination_for_smaller_stairs_size() {
        climbingStairsSolver = new ClimbingStairs();

        int stairs = 3;
        Assert.assertEquals(3, climbingStairsSolver.climbStairs(stairs));
    }

    @Test
    public void can_find_combination_for_bigger_stairs_size() {
        climbingStairsSolver = new ClimbingStairs();

        int stairs = 10;
        Assert.assertEquals(89, climbingStairsSolver.climbStairs(stairs));
    }

    @Test
    public void throws_exception_for_invalid_parameters() {
        climbingStairsSolver = new ClimbingStairs();

        int stairs = -10;
        try {
            climbingStairsSolver.climbStairs(stairs);
        } catch (InvalidParameterException e) {
            Assert.assertEquals("Number of stairs must be >= 1.", e.getMessage());
        }
    }
}
