package leetcode.easy.sum_of_values_at_indices_with_k_set_bits_2859;

import com.github.javafaker.Faker;
import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {
    private Solution solution;
    private Faker faker;

    @BeforeEach
    void setUp() {
        solution = new Solution();
        faker = new Faker();
    }

    @Test
    public void can_calculate_sum_of_values_with_k_set_bits_if_such_values_are_available() {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(10);
        nums.add(1);
        nums.add(5);
        nums.add(2);

        int k = 1;

        Assertions.assertEquals(13, solution.sumIndicesWithKSetBits(nums, k));
    }

    @Test
    public void sumIndicesWithKSetBits_returns_zero_if_no_values_with_k_set_bits_are_found_in_the_list() {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(3);
        nums.add(1);
        nums.add(2);

        int k = 3;

        Assertions.assertEquals(0, solution.sumIndicesWithKSetBits(nums, k));
    }

    @Test
    public void sumIndicesWithKSetBits_throws_null_pointer_exception_for_null_inputs() {
        int k = 3;

        try {
            solution.sumIndicesWithKSetBits(null, k);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void sumIndicesWithKSetBits_throws_illegal_argument_exception_for_nums_list_with_length_bigger_than_one_thousand() {
        List<Integer> nums = new ArrayList<>();
        int index = 1001;
        while (index-- >= 0) {
            nums.add(faker.number().numberBetween(1, 100000));
        }

        int k = 2;

        try {
            solution.sumIndicesWithKSetBits(nums, k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(solution.getMinListLength(), solution.getMaxListLength()), e.getMessage());
        }
    }

    @Test
    public void sumIndicesWithKSetBits_throws_illegal_argument_exception_for_empty_list_input() {
        List<Integer> nums = new ArrayList<>();
        int k = 2;

        try {
            solution.sumIndicesWithKSetBits(nums, k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_LENGTH_ERROR.getExceptionMessage(solution.getMinListLength(), solution.getMaxListLength()), e.getMessage());
        }
    }

    @Test
    public void sumIndicesWithKSetBits_throws_illegal_argument_exception_for_negative_k_set_value() {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(3);

        int k = -2;

        try {
            solution.sumIndicesWithKSetBits(nums, k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(solution.getMinKSetValue(), solution.getMaxKSetValue()), e.getMessage());
        }
    }

    @Test
    public void sumIndicesWithKSetBits_throws_illegal_argument_exception_for_k_set_value_bigger_than_ten() {
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);

        int k = 11;

        try {
            solution.sumIndicesWithKSetBits(nums, k);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(solution.getMinKSetValue(), solution.getMaxKSetValue()), e.getMessage());
        }
    }
}