package practice_1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        scanner.close();

        printMyNameBox(name);
    }

    public static void printMyNameBox(String name) {
        int boxWidth = name.length() + 4;
        System.out.println("+" + "-".repeat(boxWidth - 2) + "+");
        System.out.println("| " + name + " |");
        System.out.println("+" + "-".repeat(boxWidth - 2) + "+");
    }


	}


