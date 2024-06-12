package leetcode.easy.kids_with_the_greatest_number_of_candies_1431;

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.ArrayList;

import java.util.List;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

public class Solution {
    public int getMinCandies() {
        return 1;
    }

    public int getMaxCandies() {
        return 100;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Validate.notNull(candies, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(getMinCandies(), getMaxCandies(), extraCandies,
                ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(getMinCandies(), getMaxCandies()));

        List<Boolean> result = new ArrayList<>();
        int maxCandyValue = getMaxCandyValue(candies);
        for (int currentCandy : candies) {
            if (currentCandy + extraCandies < maxCandyValue) {
                result.add(false);
                continue;
            }
            result.add(true);
        }
        return result;
    }

    private int getMaxCandyValue(int[] candies) {
        int maxCandyIndex = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > candies[maxCandyIndex]) maxCandyIndex = i;
        }
        return candies[maxCandyIndex];
    }
}
