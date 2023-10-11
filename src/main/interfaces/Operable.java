package src.main.interfaces;

import src.main.enums.OperatorType;

public interface Operable {

    double performOperation(double a, double b);

    OperatorType getOperationType();
}