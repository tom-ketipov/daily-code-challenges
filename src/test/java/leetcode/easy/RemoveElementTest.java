package leetcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {
    private RemoveElement removeElementSolver;

    @Test
    public void can_remove_element_from_array() {
        removeElementSolver = new RemoveElement();

        int[] array = {3,2,2,3};
        int value = 3;

        Assert.assertEquals(2, removeElementSolver.removeElement(array, value));
    }

    @Test
    public void can_handle_missing_element_from_list() {
        removeElementSolver = new RemoveElement();

        int[] array = {3,2,2,3};
        int value = 5;

        Assert.assertEquals(0, removeElementSolver.removeElement(array, value));
    }
}
