package src.main.operations;

import src.main.customexceptions.InvalidOperator;
import src.main.interfaces.Operable;

public class OperationFactory {
    public static Operable getOperation(String operator) {

        return switch (operator) {
            case "+" -> new Addition();
            case "-" -> new Substraction();
            case "*" -> new Multiplication();
            case "/" -> new Division();
            case "sqrt" -> new SquareRoot();

            default -> throw new InvalidOperator("Invalid operator: " + operator);
        };
    }
}
