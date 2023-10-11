package src.main.operations;

import src.main.interfaces.Operable;

public class Multiplication  implements Operable {
    @Override
    public double performOperation(double a, double b) {
        return a * b;
    }

    @Override
    public String toString() {
        return "*";
    }
}
