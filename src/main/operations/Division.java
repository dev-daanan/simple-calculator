package src.main.operations;

import src.main.enums.OperatorType;
import src.main.interfaces.Operable;
import src.main.util.InputParser;

public class Division implements Operable {
    @Override
    public double performOperation(double a, double b) {
        while (b == 0) {
            b = new InputParser().getDoubleInput("Cannot divide by zero, try again: ");
        }
        return a / b;
    }

    @Override
    public OperatorType getOperationType() {
        return OperatorType.DIVISION;
    }

    @Override
    public String toString() {
        return "/";
    }
}
