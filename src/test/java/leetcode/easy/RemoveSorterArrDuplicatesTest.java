package leetcode.easy;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class RemoveSorterArrDuplicatesTest extends BaseTest {
    private RemoveSortedArrDuplicates removeSortedArrDuplicates;

    @Test
    public void can_remove_sorted_arr_duplicates() {
        removeSortedArrDuplicates = new RemoveSortedArrDuplicates();

        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        Assert.assertEquals(5, removeSortedArrDuplicates.removeDuplicates(arr));
    }
}
