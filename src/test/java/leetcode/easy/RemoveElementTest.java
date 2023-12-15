package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveElementTest {
    private RemoveElement removeElementSolver;

    @BeforeEach
    public void setUp() {
        removeElementSolver = new RemoveElement();
    }

    @Test
    public void can_remove_element_from_array() {
        int[] array = {3, 2, 2, 3};
        int value = 3;
        assertEquals(2, removeElementSolver.removeElement(array, value));
    }

    @Test
    public void can_handle_missing_element_from_list() {
        int[] array = {3, 2, 2, 3};
        int value = 5;
        assertEquals(0, removeElementSolver.removeElement(array, value));
    }
}
