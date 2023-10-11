package src.main.operations;

import src.main.interfaces.Operable;

public class OperationFactory {
    public static Operable getOperation(String operator) {

        return switch (operator) {
            case "+" -> new Addition();
            case "-" -> new Substraction();
            case "*" -> new Multiplication();
            case "/" -> new Division();

            default -> throw new IllegalArgumentException("Unexpected value: " + operator);
        };
    }
}
