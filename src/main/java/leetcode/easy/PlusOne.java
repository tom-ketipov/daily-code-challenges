package leetcode.easy;

// https://leetcode.com/problems/plus-one/description/
public class PlusOne {
    private int getFirstIncreasingIndex(int[] digits) {
        int index = digits.length - 1;

        for (int i = digits.length - 1; i >= 1; i--) {
            if (digits[i] != 9) break;
            index = i - 1;
        }

        return index;
    }

    public int[] plusOne(int[] digits) {
        int index = getFirstIncreasingIndex(digits);

        for (int i = digits.length - 1; i >= index; i--) {
            if (i == index) {
                if (digits[i] < 9) {
                    digits[i] = digits[i] + 1;
                } else {
                    digits = new int[digits.length + 1];
                    digits[0] = 1;
                }
                break;
            }
            digits[i] = 0;
        }
        return digits;
    }
}
