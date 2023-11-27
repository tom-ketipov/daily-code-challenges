package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestCommonPrefixTest extends BaseTest {
    private LongestCommonPrefix longestCommonPrefix;

    @Test
    public void can_get_longest_common_prefix() {
        longestCommonPrefix = new LongestCommonPrefix();

        String[] arr = {"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_no_common_prefix() {
        longestCommonPrefix = new LongestCommonPrefix();

        String[] arr = {"flower", "air", "millennium"};
        assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_array_with_empty_index_value() {
        longestCommonPrefix = new LongestCommonPrefix();

        String[] arr = {"flower", "", "millennium"};
        assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_array_with_empty_array() {
        longestCommonPrefix = new LongestCommonPrefix();

        String[] arr = new String[0];
        assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_array_with_too_big_array() {
        longestCommonPrefix = new LongestCommonPrefix();

        String[] arr = new String[0];
        assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }
}
