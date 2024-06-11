package leetcode.easy.find_variable_value_after_performing_operations_2011;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution operationPerformanceValueSolver;

    @BeforeEach
    void setUp() {
        operationPerformanceValueSolver = new Solution();
    }

    @Test
    public void can_calculate_operations_value_with_valid_operations_array() {
        String[] operations = {"--X", "X++", "X++"};

        Assertions.assertEquals(1, operationPerformanceValueSolver.finalValueAfterOperations(operations));
    }

    @Test
    public void finalValueAfterOperations_throws_null_pointer_exception_for_null_operations_input() {
        try {
            operationPerformanceValueSolver.finalValueAfterOperations(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void finalValueAfterOperations_throws_null_pointer_exception_for_invalid_operation_input() {
        String[] operations = {"--X", "I'm invalid", "X++"};

        try {
            operationPerformanceValueSolver.finalValueAfterOperations(operations);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}