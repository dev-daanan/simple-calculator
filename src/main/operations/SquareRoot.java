package src.main.operations;

import src.main.enums.OperatorType;
import src.main.interfaces.Operable;

public class SquareRoot implements Operable {
    @Override
    public double performOperation(double a, double b) {
        return Math.sqrt(a);
    }

    @Override
    public OperatorType getOperationType() {
        return OperatorType.SQUARE_ROOT;
    }

    @Override
    public String toString() {
        return "SquareRoot";
    }
}
