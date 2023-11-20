package leetcode.easy;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPositionTest extends BaseTest {
    private SearchInsertPosition searchInsertPosition;

    @Test
    public void can_find_insert_position_for_existing_element() {
        searchInsertPosition = new SearchInsertPosition();

        int[] arr = {1, 3, 5, 6};
        int target = 6;
        Assert.assertEquals(3, searchInsertPosition.searchInsert(arr, target));
    }

    @Test
    public void can_find_insert_position_for_bigger_put_of_bounds_element() {
        searchInsertPosition = new SearchInsertPosition();

        int[] arr = {1, 3, 5, 6};
        int target = 23;
        Assert.assertEquals(4, searchInsertPosition.searchInsert(arr, target));
    }

    @Test
    public void can_find_insert_position_for_lower_put_of_bounds_element() {
        searchInsertPosition = new SearchInsertPosition();

        int[] arr = {1, 3, 5, 6};
        int target = 0;
        Assert.assertEquals(0, searchInsertPosition.searchInsert(arr, target));
    }

    @Test
    public void can_find_insert_position_for_non_existent_in_range_element() {
        searchInsertPosition = new SearchInsertPosition();

        int[] arr = {1, 3, 5, 6};
        int target = 2;
        Assert.assertEquals(1, searchInsertPosition.searchInsert(arr, target));
    }
}
