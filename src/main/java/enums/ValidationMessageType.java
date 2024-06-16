package enums;

public enum ValidationMessageType {
    NULL_VALUE_ERROR("The input must not be null"),
    EMPTY_VALUE_ERROR("The input value must not be empty"),
    ILLEGAL_VALUE_ERROR("The input value is illegal"),
    OUT_OF_RANGE_ERROR("The input value must be between %d and %d"),
    OUT_OF_RANGE_LENGTH_ERROR("The input array/list length must be between %d and %d"),
    BELOW_MINIMUM_ERROR("The value must be bigger than %d (inclusively)"),
    ABOVE_MAXIMUM_ERROR("The value must be smaller than %d (inclusively)");


    private final String message;

    ValidationMessageType(String message) {
        this.message = message;
    }

    public String getExceptionMessage() {
        return message;
    }

    public String getExceptionMessage(Object boundary) {
        return String.format(message, boundary);
    }

    public String getExceptionMessage(Object lowerBoundary, Object upperBoundary) {
        return String.format(message, lowerBoundary, upperBoundary);
    }
}