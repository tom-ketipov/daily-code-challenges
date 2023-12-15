package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthOfLastWordTest extends BaseTest {
    private LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    public void setUp() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    public void can_get_last_word_length() {
        String sentence = "luffy is still joyboy";
        assertEquals(6, lengthOfLastWord.lengthOfLastWord(sentence));
    }

    @Test
    public void spaces_are_trimmed_from_last_word_length() {
        String sentence = "   fly me   to   the moon  ";
        assertEquals(4, lengthOfLastWord.lengthOfLastWord(sentence));
    }
}
