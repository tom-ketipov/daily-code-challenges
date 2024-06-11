package leetcode.easy.best_time_to_buy_and_sell_stock_121;

import org.apache.commons.lang3.Validate;

import static enums.ValidationMessageType.NULL_VALUE_ERROR;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Solution {
    public int maxProfit(int[] prices) {
        Validate.notNull(prices, NULL_VALUE_ERROR.getExceptionMessage());

        int sellIndex = -1, maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            int buyIndexPrice = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (buyIndexPrice > prices[j]) continue;

                if (maxProfit < prices[j] - buyIndexPrice) {
                    maxProfit = prices[j] - buyIndexPrice;
                    sellIndex = j;
                }
            }
        }
        return sellIndex + 1;
    }
}
