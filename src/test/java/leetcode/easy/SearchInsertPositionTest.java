package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInsertPositionTest extends BaseTest {
    private SearchInsertPosition searchInsertPosition;

    @BeforeEach
    public void setUp() {
        searchInsertPosition = new SearchInsertPosition();
    }

    @Test
    public void can_find_insert_position_for_existing_element() {
        int[] arr = {1, 3, 5, 6};
        int target = 6;
        assertEquals(3, searchInsertPosition.searchInsert(arr, target));
    }

    @Test
    public void can_find_insert_position_for_bigger_put_of_bounds_element() {
        int[] arr = {1, 3, 5, 6};
        int target = 23;
        assertEquals(4, searchInsertPosition.searchInsert(arr, target));
    }

    @Test
    public void can_find_insert_position_for_lower_put_of_bounds_element() {
        int[] arr = {1, 3, 5, 6};
        int target = 0;
        assertEquals(0, searchInsertPosition.searchInsert(arr, target));
    }

    @Test
    public void can_find_insert_position_for_non_existent_in_range_element() {
        int[] arr = {1, 3, 5, 6};
        int target = 2;
        assertEquals(1, searchInsertPosition.searchInsert(arr, target));
    }
}
