package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstIndexOfOccurrenceInStringTest extends BaseTest {
    private FirstIndexOfOccurrenceInString firstIndexOfOccurrenceInString;

    @Test
    public void can_locate_first_index_of_occurrence_in_string_located_at_the_end() {
        firstIndexOfOccurrenceInString = new FirstIndexOfOccurrenceInString();

        String haystack = "mississipi";
        String needle = "issipi";
        assertEquals(4, firstIndexOfOccurrenceInString.strStr(haystack, needle));
    }

    @Test
    public void can_locate_first_index_of_occurrence_in_string_located_at_the_start() {
        firstIndexOfOccurrenceInString = new FirstIndexOfOccurrenceInString();

        String haystack = "sadderdsadaze";
        String needle = "sad";
        assertEquals(0, firstIndexOfOccurrenceInString.strStr(haystack, needle));
    }

    @Test
    public void cant_locate_first_index_of_occurrence_in_string_if_non_existent() {
        firstIndexOfOccurrenceInString = new FirstIndexOfOccurrenceInString();

        String haystack = "sasddderdsfadaze";
        String needle = "sad";
        assertEquals(-1, firstIndexOfOccurrenceInString.strStr(haystack, needle));
    }

    @Test
    public void first_occurrence_index_check_is_case_sensitive() {
        firstIndexOfOccurrenceInString = new FirstIndexOfOccurrenceInString();

        String haystack = "Sadderdaze";
        String needle = "sad";
        assertEquals(-1, firstIndexOfOccurrenceInString.strStr(haystack, needle));
    }
}
