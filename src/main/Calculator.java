package src.main;

import src.main.enums.OperatorType;
import src.main.interfaces.Operable;
import src.main.operations.*;
import src.main.util.InputParser;

public class Calculator {
    /**
     * Performs a calculation based on user input and displays the result.
     */
    public void performOperation() {
        InputParser inputParser = new InputParser();
        Operable operation = null;
        double operand1;
        double operand2;
        double result;
        // Get Operation
        while (operation == null) {
            try {
                operation = OperationFactory.getOperation(inputParser.getStringInput("Enter operator (" + OperatorType.printTypeSigns() + "):"));
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        // Get operand(s) and print result
        if (operation.getOperationType() == OperatorType.SQUARE_ROOT) {
            operand1 = inputParser.getDoubleInput("Enter operand:");
            result = operation.performOperation(operand1, operand1);
            System.out.printf("%.2f %s = %.2f%n", operand1, operation, result);
        } else {
            operand1 = inputParser.getDoubleInput("Enter first operand:");
            operand2 = inputParser.getDoubleInput("Enter second operand:");
            result = operation.performOperation(operand1, operand2);
            System.out.printf("%.2f %s %.2f = %.2f%n", operand1, operation, operand2, result);
        }
    }
}
/*
* import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Calculator {
    private final InputParser inputParser = new InputParser();

    // A map to associate strings (like "+") with operations (like Double::sum).
    private final Map<String, BiFunction<Double, Double, Double>> operations = new HashMap<>() {{
        put("+", Double::sum);
        put("-", (a, b) -> a - b);
        put("*", (a, b) -> a * b);
        put("/", (a, b) -> a / b);
    }};

    public void performOperation() {
        double operand1 = inputParser.getInput("Enter first operand:", Double::parseDouble, "Not a valid number. Try again.");
        double operand2 = inputParser.getInput("Enter second operand:", Double::parseDouble, "Not a valid number. Try again.");
        String operator = inputParser.getInput("Enter operator (+, -, *, /):", input -> input, "Invalid input.");

        // Retrieve the operation from the map and apply it.
        BiFunction<Double, Double, Double> operation = operations.get(operator);
        if (operation == null) {
            System.out.println("Invalid operator. Exiting.");
            return;
        }

        double result = operation.apply(operand1, operand2);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        new Calculator().performOperation();
    }
}

* */