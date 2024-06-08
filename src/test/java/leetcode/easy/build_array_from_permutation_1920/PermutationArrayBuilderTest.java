package leetcode.easy.build_array_from_permutation_1920;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationArrayBuilderTest {
    private PermutationArrayBuilder permutationArrayBuilder;

    @BeforeEach
    void setUp() {
        permutationArrayBuilder = new PermutationArrayBuilder();
    }

    @Test
    public void can_build_permutation_array_with_valid_values() {
        int[] nums = {5, 0, 1, 2, 3, 4};

        Assertions.assertArrayEquals(new int[]{4, 5, 0, 1, 2, 3}, permutationArrayBuilder.buildArray(nums));
    }

    @Test
    public void permutationArrayBuilder_throws_illegal_argument_exception_for_input_array_with_length_bigger_than_one_thousand() {
        int[] nums = new int[1001];

        try {
            permutationArrayBuilder.buildArray(nums);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ARRAY_LENGTH_ERROR.getExceptionMessage(0, permutationArrayBuilder.getMaxArrayLength()), e.getMessage());
        }
    }

    @Test
    public void permutationArrayBuilder_throws_illegal_argument_exception_for_array_value_bigger_than_one_thousand() {
        int[] nums = {5, 0, 1001};

        try {
            permutationArrayBuilder.buildArray(nums);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(0, nums.length - 1), e.getMessage());
        }
    }
}