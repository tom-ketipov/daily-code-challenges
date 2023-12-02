package leetcode.easy;

import core.BaseTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockProfitTest extends BaseTest {
    private StockProfit stockProfitSolver;

    @BeforeEach
    public void setUp() {
        stockProfitSolver = new StockProfit();
    }

    @Test
    public void can_calculate_max_profit_for_valid_array() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, stockProfitSolver.maxProfit(prices));
    }

    @Test
    public void can_calculate_max_profit_for_valid_array_2() {
        int[] prices = {7, 1, 3, 3, 6, 4};
        assertEquals(5, stockProfitSolver.maxProfit(prices));
    }
}