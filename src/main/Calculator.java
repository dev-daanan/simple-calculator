package src.main;

import src.main.interfaces.Operable;
import src.main.operations.*;
import src.main.util.InputParser;

public class Calculator {
    /**
     * Performs a calculation based on user input and displays the result.
     */
    public void performOperation() {
        InputParser inputParser = new InputParser();
        double operand1 = inputParser.getDoubleInput("Enter first operand:");
        double operand2 = inputParser.getDoubleInput("Enter second operand:");
        Operable operation = null;

        while (operation == null) {
            try {
                operation = OperationFactory.getOperation(inputParser.getStringInput("Enter operator (+, -, *, /):"));
            } catch(IllegalArgumentException e) {
                System.out.println("Invalid input. Try again.");
            }
        }

        double result = operation.performOperation(operand1, operand2);

        System.out.printf("%.2f %s %.2f = %.2f%n", operand1, operation, operand2, result);
    }
}
