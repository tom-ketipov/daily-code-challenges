package leetcode.easy;

import java.security.InvalidParameterException;

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class UltimateStockTiming {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            throw new InvalidParameterException("Prices cannot be null or less than 2.");
        }

        int sellIndex = -1;
        int maxProfit = 0;
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
