package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import services.ValidationMessages;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UltimateStockTimingTest extends BaseTest {
    private UltimateStockTiming ultimateStockTimingSolver;

    @BeforeEach
    public void setUp() {
        ultimateStockTimingSolver = new UltimateStockTiming();
    }

    @Test
    public void can_get_ultimate_stock_timing_sell_day_index() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, ultimateStockTimingSolver.maxProfit(prices));
    }

    @Test
    public void zero_value_is_returned_for_no_profit_price_array() {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, ultimateStockTimingSolver.maxProfit(prices));
    }

    @Test
    public void exception_is_thrown_for_null_inputs() {
        try {
            ultimateStockTimingSolver.maxProfit(null);
        } catch (IllegalArgumentException e) {
            assertEquals(ValidationMessages.NOT_NULL_ARRAY_EXCEPTION_MESSAGE, e.getMessage());
        }
    }

    @Test
    public void exception_is_thrown_for_empty_array_inputs() {
        try {
            ultimateStockTimingSolver.maxProfit(new int[]{});
        } catch (IllegalArgumentException e) {
            assertEquals(ValidationMessages.NOT_VALID_ARRAY_LENGTH_EXCEPTION_MESSAGE, e.getMessage());
        }
    }
}
