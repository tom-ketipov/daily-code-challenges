package leetcode.easy.best_time_to_buy_and_sell_stock_121;

import enums.ValidationMessageType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private Solution solutionSolver;

    @BeforeEach
    public void setUp() {
        solutionSolver = new Solution();
    }

    @Test
    public void can_get_ultimate_stock_timing_sell_day_index() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        assertEquals(5, solutionSolver.maxProfit(prices));
    }

    @Test
    public void zero_value_is_returned_for_no_profit_price_array() {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, solutionSolver.maxProfit(prices));
    }

    @Test
    public void maxProfit_throws_null_pointer_exception_for_null_inputs() {
        try {
            solutionSolver.maxProfit(null);
        } catch (NullPointerException e) {
            assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}
