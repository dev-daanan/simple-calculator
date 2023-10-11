package src.main.operations;

import src.main.enums.OperatorType;
import src.main.interfaces.Operable;

public class Addition implements Operable {
    @Override
    public double performOperation(double a, double b) {
        return a + b;
    }

    @Override
    public String toString() {
        return "+";
    }

    public OperatorType getOperationType() {
        return OperatorType.ADDITION;
    }
}
