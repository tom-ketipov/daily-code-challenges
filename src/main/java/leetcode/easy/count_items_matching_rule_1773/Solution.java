package leetcode.easy.count_items_matching_rule_1773;

// https://leetcode.com/problems/count-items-matching-a-rule/description/

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

import java.util.Arrays;
import java.util.List;

public class Solution {
    protected final static String[] RULE_KEYS = {"color", "type", "name"};
    protected final static int MIN_LIST_LENGTH = 1;
    protected final static int MAX_LIST_LENGTH = 10000;

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        Validate.notNull(items, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(MIN_LIST_LENGTH, MAX_LIST_LENGTH, items.size()
                , ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_LIST_LENGTH, MAX_LIST_LENGTH));

        Validate.isTrue(isValidRuleKey(ruleKey), ValidationMessageType.ILLEGAL_MATCHING_VALUE_ERROR.getExceptionMessage(Arrays.toString(RULE_KEYS)));

        int matchingItems = 0;
        for (List<String> item : items) {
            Validate.notNull(item, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
            Validate.isTrue(item.size() == 3, ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage());

            switch (ruleKey.toLowerCase()) {
                case "type" -> {
                    if (item.get(0).equalsIgnoreCase(ruleValue)) matchingItems++;
                }

                case "color" -> {
                    if (item.get(1).equalsIgnoreCase(ruleValue)) matchingItems++;
                }

                case "name" -> {
                    if (item.get(2).equalsIgnoreCase(ruleValue)) matchingItems++;
                }
            }
        }
        return matchingItems;
    }

    private boolean isValidRuleKey(String ruleKey) {
        return Arrays.stream(RULE_KEYS)
                .anyMatch(key -> key.equalsIgnoreCase(ruleKey));
    }
}
