package leetcode.easy.find_words_containing_character_2942;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private Solution characterFinder;

    @BeforeEach
    void setUp() {
        characterFinder = new Solution();
    }

    @Test
    public void can_find_occurrences_of_a_common_character_in_multiple_strings() {
        String[] words = {"abd", "bdc", "aaaa", "cbc"};
        char x = 'a';

        Assertions.assertEquals(2, characterFinder.findWordsContaining(words, x).size());
        Assertions.assertEquals(0, characterFinder.findWordsContaining(words, x).get(0));
        Assertions.assertEquals(2, characterFinder.findWordsContaining(words, x).get(1));
    }

    @Test
    public void findWordsContaining_returns_empty_array_when_there_are_no_occurrences() {
        String[] words = {"abd", "bdc", "aaaa", "cbc"};
        char x = 'x';

        Assertions.assertTrue(characterFinder.findWordsContaining(words, x).isEmpty());
    }

    @Test
    public void findWordsContaining_throws_null_pointer_exception_for_null_input() {
        char x = 'x';

        try {
            characterFinder.findWordsContaining(null, x);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}