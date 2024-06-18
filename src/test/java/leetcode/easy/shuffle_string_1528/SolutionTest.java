package leetcode.easy.shuffle_string_1528;

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
    public void can_accurately_shuffle_string_when_provided_with_valid_indices_array_values() {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};

        Assertions.assertEquals("leetcode", solution.restoreString(s, indices));
    }

    @Test
    public void restoreString_throws_illegal_argument_exception_if_indices_array_length_is_smaller_than_the_input_string_length() {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 3};

        try {
            solution.restoreString(s, indices);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void restoreString_throws_illegal_argument_exception_if_indices_array_length_is_bigger_than_the_input_string_length() {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3, 9};

        try {
            solution.restoreString(s, indices);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void restoreString_throws_illegal_argument_exception_for_negative_indices_values() {
        String s = "codeleet";
        int[] indices = {4, 5, -1, 7, 0, 2, 1, 3};

        try {
            solution.restoreString(s, indices);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(0, s.length() - 1),
                    e.getMessage());
        }
    }

    @Test
    public void restoreString_throws_illegal_argument_exception_for_indices_values_that_are_bigger_than_string_length() {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 8, 3};

        try {
            solution.restoreString(s, indices);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.OUT_OF_RANGE_ERROR.getExceptionMessage(0, s.length() - 1),
                    e.getMessage());
        }
    }

    @Test
    public void restoreString_throws_illegal_argument_exception_for_duplicated_indices_values() {
        String s = "codeleet";
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 1};

        try {
            solution.restoreString(s, indices);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void restoreString_throws_null_pointer_exception_for_null_indices_input() {
        String s = "codeleet";

        try {
            solution.restoreString(s, null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void restoreString_throws_null_pointer_exception_for_null_input_in_place_of_the_string() {
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 1};

        try {
            solution.restoreString(null, indices);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}