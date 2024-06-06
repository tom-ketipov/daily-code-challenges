package leetcode.easy;

import enums.ValidationMessageType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UltimateStockTimingTest {
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
    public void maxProfit_throws_null_pointer_exception_for_null_inputs() {
        try {
            ultimateStockTimingSolver.maxProfit(null);
        } catch (NullPointerException e) {
            assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}
