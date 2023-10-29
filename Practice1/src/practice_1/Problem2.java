package practice_1;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side length of the square (a): ");
        
        // Read the input as a double
        double sideLength = scanner.nextDouble();
        
        // Close the scanner
        scanner.close();

        // Calculate the area of the square (a * a)
        double area = sideLength * sideLength;

        // Calculate the perimeter of the square (4 * a)
        double perimeter = 4 * sideLength;

        // Calculate the length of the diagonal of the square (a * sqrt(2))
        double diagonalLength = sideLength * Math.sqrt(2);

        // Display the calculated results
        System.out.println("Area of the square: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
        System.out.println("Length of the diagonal of the square: " + diagonalLength);
    }
}
