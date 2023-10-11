package src.main.operations;

import src.main.interfaces.Operable;
import src.main.util.InputParser;

public class Division implements Operable {
    @Override
    public double performOperation(double a, double b) {
        while (b == 0) {
            b = new InputParser().getInput("b cannot be zero, try again: ");
        }
        return a / b;
    }
}
