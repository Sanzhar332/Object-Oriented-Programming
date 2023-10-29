package practice_1;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a numeric grade
        System.out.print("Enter your numeric grade: ");
        
        // Read the input as a double
        double numericGrade = scanner.nextDouble();
        
        // Close the scanner
        scanner.close();

        // Determine the grade based on the numeric grade
        String letterGrade;

        if (numericGrade >= 90.0) {
            letterGrade = "A";
        } else if (numericGrade >= 85.0) {
            letterGrade = "A-";
        } else if (numericGrade >= 80.0) {
            letterGrade = "B+";
        } else if (numericGrade >= 75.0) {
            letterGrade = "B";
        } else if (numericGrade >= 70.0) {
            letterGrade = "B-";
        } else if (numericGrade >= 65.0) {
            letterGrade = "C+";
        } else if (numericGrade >= 60.0) {
            letterGrade = "C";
        } else if (numericGrade >= 55.0) {
            letterGrade = "C-";
        } else if (numericGrade >= 50.0) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

        // Display the calculated grade
        System.out.println("Your grade: " + letterGrade);
    }
}

