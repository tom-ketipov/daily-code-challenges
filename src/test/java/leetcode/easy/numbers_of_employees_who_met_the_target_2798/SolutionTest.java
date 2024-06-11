package leetcode.easy.numbers_of_employees_who_met_the_target_2798;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private Solution employeeHoursSolver;

    @BeforeEach
    void setUp() {
        employeeHoursSolver = new Solution();
    }

    @Test
    public void can_find_number_of_employees_that_match_target_hours_if_present() {
        int[] hours = {0, 1, 2, 5, 4};
        int target = 2;

        Assertions.assertEquals(3, employeeHoursSolver.numberOfEmployeesWhoMetTarget(hours, target));
    }

    @Test
    public void numberOfEmployeesWhoMetTarget_returns_zero_in_cases_where_no_employees_match_the_target_hours() {
        int[] hours = {0, 1, 2, 3, 5, 4};
        int target = 18;

        Assertions.assertEquals(0, employeeHoursSolver.numberOfEmployeesWhoMetTarget(hours, target));
    }

    @Test
    public void numberOfEmployeesWhoMetTarget_throws_null_pointer_exception_for_null_input() {
        try {
            employeeHoursSolver.numberOfEmployeesWhoMetTarget(null, 1);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}