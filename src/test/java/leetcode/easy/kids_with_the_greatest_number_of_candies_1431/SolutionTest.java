package leetcode.easy.kids_with_the_greatest_number_of_candies_1431;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_generate_list_with_correct_boolean_values_for_input_array_with_multiple_true_values() {
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;

        List<Boolean> candiesCache = solution.kidsWithCandies(candies, extraCandies);

        Assertions.assertEquals(5, candiesCache.size());
        Assertions.assertTrue(candiesCache.get(0));
        Assertions.assertTrue(candiesCache.get(1));
        Assertions.assertTrue(candiesCache.get(2));
        Assertions.assertFalse(candiesCache.get(3));
        Assertions.assertTrue(candiesCache.get(4));
    }

    @Test
    public void kidsWithCandies_throws_null_pointer_exception_for_null_input() {
        int extraCandies = 3;

        try {
            solution.kidsWithCandies(null, extraCandies);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void kidsWithCandies_throws_illegal_argument_exception_for_out_of_range_extra_candies_input() {
        int[] candies = {23, 2, 8, 12, 3};
        int extraCandies = 300;

        try {
            solution.kidsWithCandies(candies, extraCandies);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(solution.getMinCandies(), solution.getMaxCandies()), e.getMessage());
        }
    }
}