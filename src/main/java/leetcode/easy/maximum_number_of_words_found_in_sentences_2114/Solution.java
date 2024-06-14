package leetcode.easy.maximum_number_of_words_found_in_sentences_2114;

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

// https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/submissions/1287626877/

public class Solution {
    public int getMinValue() {
        return 1;
    }

    public int getMaxValue() {
        return 100;
    }

    public int mostWordsFound(String[] sentences) {
        Validate.notNull(sentences, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(getMinValue(), getMaxValue(), sentences.length,
                ValidationMessageType.OUT_OF_RANGE_ARRAY_LENGTH_ERROR.getExceptionMessage(getMinValue(), getMaxValue()));

        int maxWords = 0;
        for (String currentSentence : sentences) {
            validateSentence(currentSentence);

            int currentSentenceWords = currentSentence.split(" ").length;
            if (maxWords < currentSentenceWords) maxWords = currentSentenceWords;
        }

        return maxWords;
    }

    private void validateSentence(String sentence) {
        String[] words = sentence.split(" ");
        for (String currentWord : words) {
            // check if the words in the sentence are in allowed margins
            Validate.inclusiveBetween(getMinValue(), getMaxValue(), currentWord.length(),
                    ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage());
        }

        // check if there are any consecutive spaces
        Validate.isTrue(!sentence.contains("  "), ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage());
    }
}
