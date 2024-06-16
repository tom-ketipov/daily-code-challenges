package leetcode.easy.minimum_operations_to_exceed_threshold_value_3065;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_find_minimum_number_of_needed_operations_that_exceeds_value_threshold_in_input_array_if_possible() {
        int[] nums = {760340387, 289254123, 628299234, 204198715, 565672759, 684967229, 303459334, 302262994, 770720781, 383343826, 148523784, 750183433, 778902176, 930418501, 520286131, 441750197, 402643198, 547480026, 799770607, 303114486, 481644752, 320289220, 792197603, 44751343, 828179295, 804048578, 468569446, 555743704, 416141129, 865011209, 56010709, 133835994, 200083188, 740956911, 842527451, 728469270, 370323078, 880010797, 977376598, 598070033, 866374140, 110775975, 609860085};
        int k = 377260496;

        Assertions.assertEquals(13, solution.minOperations(nums, k));
    }

    @Test
    public void minOperations_returns_input_array_length_if_threshold_cannot_be_exceeded_with_current_values() {
        int[] nums = {2, 11, 10, 1, 3};
        int k = Integer.MAX_VALUE;

        Assertions.assertEquals(5, solution.minOperations(nums, k));
    }

    @Test
    public void minOperations_returns_zero_if_threshold_threshold_is_smaller_than_first_index() {
        int[] nums = {2, 11, 10, 13, 3};
        int k = 1;

        Assertions.assertEquals(0, solution.minOperations(nums, k));
    }

    @Test
    public void minOperations_throws_null_pointer_exception_for_null_input_array_value() {
        int[] nums = {2, 11, 10, 1, 3};
        int k = Integer.MAX_VALUE;

        try {
            solution.minOperations(null, k);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}