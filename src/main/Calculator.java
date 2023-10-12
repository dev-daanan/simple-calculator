package src.main;

import src.main.customexceptions.CalculatorException;
import src.main.customexceptions.NegativeNumberException;
import src.main.enums.OperatorType;
import src.main.interfaces.Operable;
import src.main.operations.OperationFactory;
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
                operation = OperationFactory.getOperation(inputParser.getStringInput("Enter operator (" + OperatorType.getTypeSigns() + "):"));
            } catch (CalculatorException e) {
                System.out.println("-------------------");
                System.out.println(e.getMessage());
                System.out.println("-------------------");
            }
        }

        // Get operand(s) and print result

        if (operation.getOperationType() == OperatorType.SQUARE_ROOT) {
            do {
                try {
                    operand1 = inputParser.getDoubleInput("Enter operand:");
                    if (operand1 < 0) {
                        throw new NegativeNumberException("Cannot calculate the square root of a negative number: " + operand1);
                    }
                } catch (Exception e) {
                    continue;
                }
                break;
            } while (true);
            result = operation.performOperation(operand1, operand1);
            System.out.printf("%s of %.2f = %.2f%n", operation, operand1, result);
        } else {
            operand1 = inputParser.getDoubleInput("Enter first operand:");
            operand2 = inputParser.getDoubleInput("Enter second operand:");
            result = operation.performOperation(operand1, operand2);
            System.out.printf("%.2f %s %.2f = %.2f%n", operand1, operation, operand2, result);
        }

    }
}