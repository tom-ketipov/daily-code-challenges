package leetcode.easy.count_pairs_whose_sum_is_less_than_target_2824;

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
    public void can_calculate_count_of_pairs_less_than_a_positive_target_in_case_there_are_such_pairs() {
        List<Integer> nums = new ArrayList<>();
        nums.add(-1);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);

        int target = 2;

        Assertions.assertEquals(3, solution.countPairs(nums, target));
    }

    @Test
    public void can_calculate_count_of_pairs_less_than_a_negative_target_in_case_there_are_such_pairs() {
        List<Integer> nums = new ArrayList<>();
        nums.add(-6);
        nums.add(2);
        nums.add(5);
        nums.add(-2);
        nums.add(-7);
        nums.add(-1);
        nums.add(3);

        int target = -2;

        Assertions.assertEquals(10, solution.countPairs(nums, target));
    }

    @Test
    public void countPairs_returns_zero_in_case_there_are_no_pairs_smaller_than_the_target() {
        List<Integer> nums = new ArrayList<>();
        nums.add(6);
        nums.add(12);
        nums.add(54);
        nums.add(22);
        nums.add(57);
        nums.add(91);
        nums.add(-6);

        int target = 0;

        Assertions.assertEquals(0, solution.countPairs(nums, target));
    }

    @Test
    public void countPairs_throws_null_pointer_exception_for_null_input() {
        int target = -2;

        try {
            solution.countPairs(null, target);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}