package external;

import core.BaseTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinarySearchTest extends BaseTest {
    private BinarySearch binarySearch;

    @Test
    public void can_find_existing_element() {
        binarySearch = new BinarySearch();

        int[] arr = generateRandomIntegerArray(100, 0, 150);
        int target = arr[10];

        Arrays.sort(arr);
        assertTrue(binarySearch.findElement(target, arr));
    }

    @Test
    public void can_find_first_element() {
        binarySearch = new BinarySearch();

        int[] arr = generateRandomIntegerArray(100, 0, 51);
        int target = arr[0];

        Arrays.sort(arr);
        assertTrue(binarySearch.findElement(target, arr));
    }

    @Test
    public void can_find_last_element() {
        binarySearch = new BinarySearch();

        int[] arr = generateRandomIntegerArray(100, 0, 33);
        int target = arr[arr.length - 1];

        Arrays.sort(arr);
        assertTrue(binarySearch.findElement(target, arr));
    }

    @Test
    public void cant_find_non_existing_elements() {
        binarySearch = new BinarySearch();

        int[] arr = generateRandomIntegerArray(100, 0, 150);
        int target = 151;

        Arrays.sort(arr);
        assertFalse(binarySearch.findElement(target, arr));
    }

    @Test
    public void can_find_negative_elements() {
        binarySearch = new BinarySearch();

        int[] arr = generateRandomIntegerArray(100, -120, -1);
        int target = arr[25];

        Arrays.sort(arr);
        assertTrue(binarySearch.findElement(target, arr));
    }
}
