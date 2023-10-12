package src.main.customexceptions;

public class NegativeNumberException extends CalculatorException {
    public NegativeNumberException(String message) {
        super(message);
    }
}
