package core;

public class BaseTest {
    /**
     * Generates an array of random integers with the specified length, minimum, and maximum values.
     *
     * @param length   The length of the array to be generated.
     * @param minValue The minimum value (inclusive) of the random integers in the array.
     * @param maxValue The maximum value (inclusive) of the random integers in the array.
     * @return An array of random integers with the specified length and range.
     * @throws IllegalArgumentException if length is less than or equal to 0,
     *                                  or if minValue is greater than maxValue.
     */
    public int[] generateRandomIntegerArray(int length, int minValue, int maxValue) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }

        if (minValue > maxValue) {
            throw new IllegalArgumentException("minValue must be less than or equal to maxValue");
        }

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = generateRandomInteger(minValue, maxValue);
        }

        return arr;
    }

    protected int generateRandomInteger(int minValue, int maxValue) {
        return (int) (Math.random() * (maxValue - minValue + 1) + minValue);
    }
}
