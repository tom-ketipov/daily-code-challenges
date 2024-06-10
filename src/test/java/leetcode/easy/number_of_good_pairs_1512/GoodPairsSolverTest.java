package leetcode.easy.number_of_good_pairs_1512;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodPairsSolverTest {
    private GoodPairsSolver goodPairsSolver;

    @BeforeEach
    void setUp() {
        goodPairsSolver = new GoodPairsSolver();
    }

    @Test
    public void can_find_number_of_good_pairs_in_good_pairs_array() {
        int[] nums = {1, 2, 3, 1, 1, 3};

        Assertions.assertEquals(4, goodPairsSolver.numIdenticalPairs(nums));
    }

    @Test
    public void numIdenticalPairs_returns_zero_when_no_good_pairs_are_found() {
        int[] nums = {3, 2, 1, 5, 6, 8};

        Assertions.assertEquals(0, goodPairsSolver.numIdenticalPairs(nums));
    }

    @Test
    public void numIdenticalPairs_throws_null_pointer_exception_for_null_input() {
        try {
            goodPairsSolver.numIdenticalPairs(null);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}