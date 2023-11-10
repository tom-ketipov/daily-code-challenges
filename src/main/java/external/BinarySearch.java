package external;

import java.util.Arrays;

public class BinarySearch {

    /**
     * Searches for a target element in a sorted integer array using recursive binary search.
     * <p>
     * This method assumes that the input array is sorted in ascending order.
     *
     * @param target The integer value to be searched for in the array.
     * @param arr    The sorted integer array in which the target element is to be found.
     * @return true if the target element is found in the array, false otherwise.
     */
    public boolean findElement(int target, int[] arr) {
        int midIndex = arr.length / 2;
        if (arr[midIndex] == target) return true;

        if (arr.length == 1) return false;
        if (arr[midIndex] > target) {
            return findElement(target, Arrays.stream(arr, 0, midIndex).toArray());
        } else {
            return findElement(target, Arrays.stream(arr, midIndex, arr.length).toArray());
        }
    }
}
