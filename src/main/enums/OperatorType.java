package src.main.enums;

public enum OperatorType {
    ADDITION,
    SUBTRACTION,
    MULTIPLICATION,
    DIVISION,
    SQUARE_ROOT;

    /**
     * @return the available types in there designated signs
     */
    public static String printTypeSigns() {
        return "+, -, *, /, sqrt";
    }
}
