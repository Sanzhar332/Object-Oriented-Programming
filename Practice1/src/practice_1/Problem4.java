package practice_1;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter coefficients a, b, and c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant (D)
        double discriminant = b * b - 4 * a * c;

        if (discriminant >= 0) {
            // Calculate the roots only if D is non-negative to avoid redundant calculations
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Display the roots
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else {
            // Display an error message for negative discriminant
            System.out.println("Error: The discriminant is negative. No real roots exist.");
        }

        // Close the scanner
        scanner.close();
    }
}
