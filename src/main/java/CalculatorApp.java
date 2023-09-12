import javax.swing.*;
import java.util.Scanner;

public class CalculatorApp {
    public static <string> void main(String[] args) {
        double valueOne;
        double valueTwo;
        int option;
        boolean condition = true;

        while (condition) {
            option = Integer.parseInt(JOptionPane.showInputDialog("""
                    Calculator enter the option to be used:
                                          1 - Addition\s
                                          2 - Subtraction\s
                                          3 - Multiplication\s
                                          4 - Division\s
                                          5 - Percentage\s
                                          6 - Exit\s   """
            ));
            switch (option) {
                case 1 -> {
                    valueOne = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: ")); //JOptionPane creates a dialog box with a message "Enter an integer: " as a prompt, and it waits for the user to enter some text. It will display this prompt to the user as a text input field in a popup dialog box.
                    valueTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter another number: ")); //Integer.parseInt is used to convert the text entered by the user into an integer. It takes a string as input, attempts to parse it as an integer, and returns an integer value.
                    double add = valueOne + valueTwo;
                    JOptionPane.showMessageDialog(null, "The result is: " + add);
                }
                case 2 -> {
                    valueOne = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
                    valueTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter another number: "));
                    double subtract = valueOne - valueTwo;
                    JOptionPane.showMessageDialog(null, "The result is: " + subtract);
                }
                case 3 -> {
                    valueOne = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
                    valueTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter another number: "));
                    double multiplication = valueOne * valueTwo;
                    JOptionPane.showMessageDialog(null, "The result is: " + multiplication);
                }
                case 4 -> {
                    valueOne = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
                    valueTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter another number: "));
                    if (valueTwo == 0) {
                        JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
                    } else {
                        double division = valueOne % valueTwo;
                        JOptionPane.showMessageDialog(null, "The result is: " + division);
                    }
                }
                case 5 -> {
                    valueOne = Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
                    valueTwo = Double.parseDouble(JOptionPane.showInputDialog("Enter another number: "));
                    double percentage = valueOne / valueTwo;
                    JOptionPane.showMessageDialog(null, "The result is: " + percentage);

                }
                case 6 -> {
                    condition = false;
                    JOptionPane.showMessageDialog(null, "You left the system!");

                }
            }

        }

    }
}
