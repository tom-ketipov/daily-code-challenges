package leetcode.easy;

import core.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest extends BaseTest {
    private LengthOfLastWord lengthOfLastWord;

    @Test
    public void can_get_last_word_length() {
        lengthOfLastWord = new LengthOfLastWord();

        String sentence = "luffy is still joyboy";
        Assert.assertEquals(6, lengthOfLastWord.lengthOfLastWord(sentence));
    }

    @Test
    public void spaces_are_trimmed_from_last_word_length() {
        lengthOfLastWord = new LengthOfLastWord();

        String sentence = "   fly me   to   the moon  ";
        Assert.assertEquals(4, lengthOfLastWord.lengthOfLastWord(sentence));
    }
}
