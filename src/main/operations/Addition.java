package src.main.operations;

import src.main.interfaces.Operable;

public class Addition implements Operable {
    @Override
    public double performOperation(double a, double b) {
        return a + b;
    }
}
