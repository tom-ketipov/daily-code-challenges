package leetcode.easy.count_items_matching_rule_1773;

import enums.ValidationMessageType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static leetcode.easy.count_items_matching_rule_1773.Solution.RULE_KEYS;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void can_count_matching_items_of_valid_color_rule_key_value_pair() {
        // item A
        List<String> itemA = new ArrayList<>();
        itemA.add("phone");
        itemA.add("blue");
        itemA.add("pixel");

        // item B
        List<String> itemB = new ArrayList<>();
        itemB.add("computer");
        itemB.add("silver");
        itemB.add("lenovo");

        // item C
        List<String> itemC = new ArrayList<>();
        itemC.add("phone");
        itemC.add("golder");
        itemC.add("iPhone");

        List<List<String>> items = new ArrayList<>();
        items.add(itemA);
        items.add(itemB);
        items.add(itemC);

        String ruleKey = "color";
        String ruleValue = "silver";

        Assertions.assertEquals(1, solution.countMatches(items, ruleKey, ruleValue));
    }

    @Test
    public void can_count_matching_items_of_valid_type_rule_key_value_pair() {
        // item A
        List<String> itemA = new ArrayList<>();
        itemA.add("phone");
        itemA.add("blue");
        itemA.add("pixel");

        // item B
        List<String> itemB = new ArrayList<>();
        itemB.add("computer");
        itemB.add("silver");
        itemB.add("lenovo");

        // item C
        List<String> itemC = new ArrayList<>();
        itemC.add("phone");
        itemC.add("golder");
        itemC.add("iPhone");

        List<List<String>> items = new ArrayList<>();
        items.add(itemA);
        items.add(itemB);
        items.add(itemC);

        String ruleKey = "type";
        String ruleValue = "phone";

        Assertions.assertEquals(2, solution.countMatches(items, ruleKey, ruleValue));
    }

    @Test
    public void can_count_matching_items_of_valid_name_rule_key_value_pair() {
        // item A
        List<String> itemA = new ArrayList<>();
        itemA.add("phone");
        itemA.add("blue");
        itemA.add("pixel");

        // item B
        List<String> itemB = new ArrayList<>();
        itemB.add("computer");
        itemB.add("silver");
        itemB.add("lenovo");

        // item C
        List<String> itemC = new ArrayList<>();
        itemC.add("phone");
        itemC.add("golder");
        itemC.add("iPhone");

        List<List<String>> items = new ArrayList<>();
        items.add(itemA);
        items.add(itemB);
        items.add(itemC);

        String ruleKey = "name";
        String ruleValue = "lenovo";

        Assertions.assertEquals(1, solution.countMatches(items, ruleKey, ruleValue));
    }

    @Test
    public void countMatches_is_case_insensitive() {
        // item A
        List<String> itemA = new ArrayList<>();
        itemA.add("phone");
        itemA.add("blue");
        itemA.add("pixel");

        // item B
        List<String> itemB = new ArrayList<>();
        itemB.add("computer");
        itemB.add("silver");
        itemB.add("lenovo");

        // item C
        List<String> itemC = new ArrayList<>();
        itemC.add("phone");
        itemC.add("golder");
        itemC.add("iPhone");

        List<List<String>> items = new ArrayList<>();
        items.add(itemA);
        items.add(itemB);
        items.add(itemC);

        String ruleKey = "nAmE";
        String ruleValue = "LENOVo";

        Assertions.assertEquals(1, solution.countMatches(items, ruleKey, ruleValue));
    }

    @Test
    public void countMatches_returns_zero_when_no_matching_results_are_found() {
        // item A
        List<String> itemA = new ArrayList<>();
        itemA.add("phone");
        itemA.add("blue");
        itemA.add("pixel");

        // item B
        List<String> itemB = new ArrayList<>();
        itemB.add("computer");
        itemB.add("silver");
        itemB.add("lenovo");

        // item C
        List<String> itemC = new ArrayList<>();
        itemC.add("phone");
        itemC.add("golder");
        itemC.add("iPhone");

        List<List<String>> items = new ArrayList<>();
        items.add(itemA);
        items.add(itemB);
        items.add(itemC);

        String ruleKey = "name";
        String ruleValue = "xiaomi";

        Assertions.assertEquals(0, solution.countMatches(items, ruleKey, ruleValue));
    }

    @Test
    public void countMatches_throws_illegal_argument_exception_for_invalid_rule_key() {
        // item A
        List<String> itemA = new ArrayList<>();
        itemA.add("phone");
        itemA.add("blue");
        itemA.add("pixel");

        List<List<String>> items = new ArrayList<>();
        items.add(itemA);

        String ruleKey = "cpu";
        String ruleValue = "random cpu name v2.0.34";

        try {
            solution.countMatches(items, ruleKey, ruleValue);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_MATCHING_VALUE_ERROR.getExceptionMessage(Arrays.toString(RULE_KEYS)),
                    e.getMessage());
        }
    }

    @Test
    public void countMatches_throws_illegal_argument_exception_for_invalid_item_length() {
        // item A
        List<String> itemA = new ArrayList<>();
        itemA.add("phone");
        itemA.add("blue");
        itemA.add("pixel");
        itemA.add("invalid");

        List<List<String>> items = new ArrayList<>();
        items.add(itemA);

        String ruleKey = "name";
        String ruleValue = "pixel";

        try {
            solution.countMatches(items, ruleKey, ruleValue);
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals(ValidationMessageType.ILLEGAL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void countMatches_throws_null_pointer_exception_for_null_items_list_input() {
        String ruleKey = "name";
        String ruleValue = "iPhone";

        try {
            solution.countMatches(null, ruleKey, ruleValue);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }

    @Test
    public void countMatches_throws_null_pointer_exception_for_null_item_input() {
        // item A
        List<String> itemA = new ArrayList<>();
        itemA.add("phone");
        itemA.add("blue");
        itemA.add("pixel");

        List<List<String>> items = new ArrayList<>();
        items.add(itemA);
        items.add(null);

        String ruleKey = "name";
        String ruleValue = "pixel";

        try {
            solution.countMatches(items, ruleKey, ruleValue);
        } catch (NullPointerException e) {
            Assertions.assertEquals(ValidationMessageType.NULL_VALUE_ERROR.getExceptionMessage(), e.getMessage());
        }
    }
}