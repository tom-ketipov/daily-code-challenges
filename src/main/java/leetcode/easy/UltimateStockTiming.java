package leetcode.easy;

import services.ValidationMessages;
import services.ValidationService;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class UltimateStockTiming {
    public int maxProfit(int[] prices) {
        ValidationService.validateNotNull(prices, ValidationMessages.NOT_NULL_ARRAY_EXCEPTION_MESSAGE);
        ValidationService.validateArrayLengthInRange(prices, 2, Integer.MAX_VALUE, ValidationMessages.NOT_VALID_ARRAY_LENGTH_EXCEPTION_MESSAGE);

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
