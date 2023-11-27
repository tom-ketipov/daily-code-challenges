package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UltimateStockTimingTest extends BaseTest {
    private UltimateStockTiming ultimateStockTimingSolver;

    @Test
    public void can_get_ultimate_stock_timing_sell_day_index() {
        ultimateStockTimingSolver = new UltimateStockTiming();

        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, ultimateStockTimingSolver.maxProfit(prices));
    }

    @Test
    public void zero_value_is_returned_for_no_profit_price_array() {
        ultimateStockTimingSolver = new UltimateStockTiming();

        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, ultimateStockTimingSolver.maxProfit(prices));
    }

    @Test
    public void exception_is_thrown_for_null_inputs() {
        ultimateStockTimingSolver = new UltimateStockTiming();

        try {
            ultimateStockTimingSolver.maxProfit(null);
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), "Prices cannot be null or less than 2.");
        }
    }

    @Test
    public void exception_is_thrown_for_empty_array_inputs() {
        ultimateStockTimingSolver = new UltimateStockTiming();

        try {
            ultimateStockTimingSolver.maxProfit(new int[]{});
        } catch (InvalidParameterException e) {
            assertEquals(e.getMessage(), "Prices cannot be null or less than 2.");
        }
    }
}
