package src.main.operations;

import src.main.enums.OperatorType;
import src.main.interfaces.Operable;

public class Substraction  implements Operable {
    @Override
    public double performOperation(double a, double b) {
        return a - b;
    }

    @Override
    public OperatorType getOperationType() {
        return OperatorType.SUBTRACTION;
    }

    @Override
    public String toString() {
        return "-";
    }
}
