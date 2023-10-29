package practice_1;

public class Problem5 {
    public static void main(String[] args) {
        // Define the initial balance and interest rate (you can change these values)
        double initialBalance = 2000.0; // Initial balance
        double interestRate = 0.05;     // Interest rate (5%)

        // Calculate the new balance after adding interest
        double newBalance = initialBalance + (initialBalance * interestRate);

        // Display the initial balance, interest rate, and new balance
        System.out.println("Initial Balance: $" + initialBalance);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println("New Balance: $" + newBalance);
    }
}

