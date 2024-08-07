package leetcode.easy.remove_duplicates_from_sorted_array_26;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveSorterArrDuplicatesTest {
    private Solution removeSortedArrDuplicates;

    @BeforeEach
    public void setUp() {
        removeSortedArrDuplicates = new Solution();
    }

    @Test
    public void can_remove_sorted_arr_duplicates() {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, removeSortedArrDuplicates.removeDuplicates(arr));
    }
}
