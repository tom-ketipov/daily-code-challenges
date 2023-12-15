package leetcode.easy;

import core.BaseTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveSorterArrDuplicatesTest extends BaseTest {
    private RemoveSortedArrDuplicates removeSortedArrDuplicates;

    @BeforeEach
    public void setUp() {
        removeSortedArrDuplicates = new RemoveSortedArrDuplicates();
    }

    @Test
    public void can_remove_sorted_arr_duplicates() {
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, removeSortedArrDuplicates.removeDuplicates(arr));
    }
}
