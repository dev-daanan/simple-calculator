package src.main.enums;


public enum OperatorType {
    ADDITION("+"),
    SUBTRACTION("-"),
    MULTIPLICATION("*"),
    DIVISION("/"),
    SQUARE_ROOT("sqrt");

    private final String symbol;

    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    /**
     * @return the available types in there designated signs
     */
    public static String getTypeSigns() {
        StringBuilder stringBuilder = new StringBuilder();
        int numOperators = OperatorType.values().length;

        OperatorType[] operatorTypes = OperatorType.values();

        for (int i = 0; i < numOperators; i++) {
            stringBuilder.append(operatorTypes[i].symbol);
            if (i < numOperators - 1) {
                stringBuilder.append(", ");
            }
        }
        return stringBuilder.toString();
    }
}
