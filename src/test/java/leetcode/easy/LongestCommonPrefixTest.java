package leetcode.easy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest {
    private LongestCommonPrefix longestCommonPrefix;

    @BeforeEach
    public void setUp() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void can_get_longest_common_prefix() {
        String[] arr = {"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_no_common_prefix() {
        String[] arr = {"flower", "air", "millennium"};
        assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_array_with_empty_index_value() {
        String[] arr = {"flower", "", "millennium"};
        assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_array_with_empty_array() {
        String[] arr = new String[0];
        assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_array_with_too_big_array() {
        String[] arr = new String[0];
        assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }
}
