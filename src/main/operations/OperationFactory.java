package src.main.operations;

import src.main.interfaces.Operable;

public class OperationFactory {
    public static Operable getOperation(String operator) {

        /*
         * This list is printed in Calculator changes here must be made there
         */
        return switch (operator) {
            case "+" -> new Addition();
            case "-" -> new Substraction();
            case "*" -> new Multiplication();
            case "/" -> new Division();
            case "sqrt" -> new SquareRoot();

            default -> throw new IllegalArgumentException("Unexpected value: " + operator);
        };
    }
}
