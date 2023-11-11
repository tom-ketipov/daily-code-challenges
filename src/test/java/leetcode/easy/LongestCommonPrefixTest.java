package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestCommonPrefixTest extends BaseTest {
    private LongestCommonPrefix longestCommonPrefix;

    @Test
    public void can_get_longest_common_prefix() {
        longestCommonPrefix = new LongestCommonPrefix();

        String[] arr = {"flower", "flow", "flight"};
        Assertions.assertEquals("fl", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_no_common_prefix() {
        longestCommonPrefix = new LongestCommonPrefix();

        String[] arr = {"flower", "air", "millennium"};
        Assertions.assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_array_with_empty_index_value() {
        longestCommonPrefix = new LongestCommonPrefix();

        String[] arr = {"flower", "", "millennium"};
        Assertions.assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_array_with_empty_array() {
        longestCommonPrefix = new LongestCommonPrefix();

        String[] arr = new String[0];
        Assertions.assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }

    @Test
    public void empty_string_is_returned_for_array_with_too_big_array() {
        longestCommonPrefix = new LongestCommonPrefix();

        String[] arr = new String[0];
        Assertions.assertEquals("", longestCommonPrefix.getLongestCommonPrefix(arr));
    }
}
