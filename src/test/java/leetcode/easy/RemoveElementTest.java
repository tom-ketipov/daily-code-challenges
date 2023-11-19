package leetcode.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveElementTest {
    private RemoveElement removeElementSolver;

    @Test
    public void can_remove_element_from_array() {
        removeElementSolver = new RemoveElement();

        int[] array = {3,2,2,3};
        int value = 3;

        Assertions.assertEquals(2, removeElementSolver.removeElement(array, value));
    }

    @Test
    public void can_handle_missing_element_from_list() {
        removeElementSolver = new RemoveElement();

        int[] array = {3,2,2,3};
        int value = 5;

        Assertions.assertEquals(0, removeElementSolver.removeElement(array, value));
    }
}
