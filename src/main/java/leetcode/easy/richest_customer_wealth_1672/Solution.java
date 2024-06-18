package leetcode.easy.richest_customer_wealth_1672;

import enums.ValidationMessageType;
import org.apache.commons.lang3.Validate;

// https://leetcode.com/problems/richest-customer-wealth/description/

public class Solution {
    protected final static int MIN_ARR_LENGTH = 1;
    protected final static int MAX_ARR_LENGTH = 50;
    protected final static int MIN_VALUE = 1;
    protected final static int MAX_VALUE = 100;

    public int maximumWealth(int[][] accounts) {
        Validate.notNull(accounts, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
        Validate.inclusiveBetween(MIN_ARR_LENGTH, MAX_ARR_LENGTH, accounts.length,
                ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH));

        int maxWealth = 0;
        for (int[] account : accounts) {
            Validate.notNull(account, ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage());
            Validate.inclusiveBetween(MIN_ARR_LENGTH, MAX_ARR_LENGTH, account.length,
                    ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH));

            int currentAccountWealth = 0;
            for (int cash : account) {
                Validate.inclusiveBetween(MIN_VALUE, MAX_VALUE, cash,
                        ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE));

                currentAccountWealth += cash;
            }
            if (currentAccountWealth > maxWealth) maxWealth = currentAccountWealth;
        }
        return maxWealth;
    }
}
