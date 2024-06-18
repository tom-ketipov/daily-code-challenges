package leetcode.easy.richest_customer_wealth_1672;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static leetcode.easy.richest_customer_wealth_1672.Solution.*;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_find_richest_customer_wealth_in_list_where_there_is_only_one_such_account() {
        int[][] accounts = {{1, 5}, {7, 3}, {3, 5}};
        Assertions.assertEquals(10, solution.maximumWealth(accounts));
    }

    @Test
    public void can_find_richest_customer_wealth_in_list_where_there_are_multiple_accounts_with_equal_max_value() {
        int[][] accounts = {{10}, {7, 3}, {6, 1, 2, 1}, {8, 1}};
        Assertions.assertEquals(10, solution.maximumWealth(accounts));
    }

    @Test
    public void maximumWealth_throws_illegal_argument_exception_for_accounts_with_length_smaller_than_allowed_min() {
        int[][] accounts = {{1, 2, 3}, {7, 3}, {}};

        try {
            solution.maximumWealth(accounts);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void maximumWealth_throws_illegal_argument_exception_for_accounts_with_length_bigger_than_allowed_max() {
        int[][] accounts = {{1, 2, 3}, {7, 3}, new int[MAX_ARR_LENGTH + 1]};

        try {
            solution.maximumWealth(accounts);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void maximumWealth_throws_illegal_argument_exception_for_accounts_with_values_smaller_than_allowed_min() {
        int[][] accounts = {{1, 2, MIN_VALUE - 1}};

        try {
            solution.maximumWealth(accounts);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE), e.getMessage());
        }
    }

    @Test
    public void maximumWealth_throws_illegal_argument_exception_for_accounts_with_values_bigger_than_allowed_max() {
        int[][] accounts = {{1, 2, MAX_VALUE + 1}};

        try {
            solution.maximumWealth(accounts);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(MIN_VALUE, MAX_VALUE), e.getMessage());
        }
    }

    @Test
    public void maximumWealth_throws_illegal_argument_exception_for_input_with_less_than_min_allowed_accounts() {
        int[][] accounts = new int[0][1];

        try {
            solution.maximumWealth(accounts);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void maximumWealth_throws_illegal_argument_exception_for_input_with_more_than_max_allowed_accounts() {
        int[][] accounts = new int[MAX_ARR_LENGTH + 1][1];

        try {
            solution.maximumWealth(accounts);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(MIN_ARR_LENGTH, MAX_ARR_LENGTH), e.getMessage());
        }
    }

    @Test
    public void maximumWealth_throws_null_pointer_exception_for_null_input() {
        try {
            solution.maximumWealth(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void maximumWealth_throws_null_pointer_exception_for_null_account_input() {
        int[][] accounts = {{6, 1, 2, 1}, null, {8, 1}};

        try {
            solution.maximumWealth(accounts);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}