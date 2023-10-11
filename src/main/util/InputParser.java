package src.main.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputParser {
    private static final Scanner scanner = new Scanner(System.in);

    /**
     * Retrieves input from the user and converts it to a double.
     * @param prompt - prompt for input
     * @return double
     */
    public double getInput(String prompt) {
        System.out.println(prompt);
        double inputDouble;
        do {
            try {
                String inputString = scanner.nextLine();
                inputDouble = Double.parseDouble(inputString);
            } catch (NumberFormatException | NullPointerException | InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number. Try again.");
                continue;
            }
            return inputDouble;
        } while (true);
    }


}
