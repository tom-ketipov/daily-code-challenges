package leetcode.easy.find_words_containing_character_2942;

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-words-containing-character/

public class CharacterFinder {
    public List<Integer> findWordsContaining(String[] words, char x) {
        Validate.notNull(words, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());

        List<Integer> occurrences = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(String.valueOf(x))) occurrences.add(i);
        }

        return occurrences;
    }
}
