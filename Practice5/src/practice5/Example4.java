package practice5;

import java.util.*;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter expressions: ");
        String input = in.nextLine();
        String[] expressions = input.split(" ");

        for (String expression : expressions) {
            StringTokenizer tokenizer = new StringTokenizer(expression, "+-*/", true);
            double result;
            double leftOperand;
            double rightOperand;
            String leftString = null;
            String operator;
            String rightString = null;

            try {
                leftString = tokenizer.nextToken();
                operator = tokenizer.nextToken();
                rightString = tokenizer.nextToken();

                leftOperand = Double.parseDouble(leftString);
                rightOperand = Double.parseDouble(rightString);

                if (operator.equals("+")) {
                    result = leftOperand + rightOperand;
                } else if (operator.equals("-")) {
                    result = leftOperand - rightOperand;
                } else if (operator.equals("*")) {
                    result = leftOperand * rightOperand;
                } else if (operator.equals("/")) {
                    if (rightOperand == 0) {
                        System.out.println("Cannot divide by zero");
                        return;
                    }
                    result = leftOperand / rightOperand;
                } else {
                    result = 0.0;
                }

                System.out.println("Result: " + result);
            } catch (NoSuchElementException nsee) {
                System.out.println("Invalid syntax");
            } catch (NumberFormatException nfe) {
                try {
                    Double.parseDouble(leftString);
                } catch (NumberFormatException leftNfe) {
                    System.out.println(leftString + " is not a number");
                }

                try {
                    Double.parseDouble(rightString);
                } catch (NumberFormatException rightNfe) {
                    System.out.println(rightString + " is not a number");
                }
            }
        }
    }
}
