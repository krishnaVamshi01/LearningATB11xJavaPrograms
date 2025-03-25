package EveryDay_Tasks;

import java.util.Scanner;

public class march_13th_Grade_cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your score: ");

        // Check if the input is an integer
        if (scanner.hasNextInt()) {
            int marks = scanner.nextInt();

            if (marks >= 90 && marks <= 100) {
                System.out.println("Your grade is A");
            } else if (marks >= 80 && marks <= 89) {
                System.out.println("Your grade is B");
            } else if (marks >= 70 && marks <= 79) {
                System.out.println("Your grade is C");
            } else if (marks >= 60 && marks <= 69) {
                System.out.println("Your grade is D");
            } else if (marks >= 0 && marks <= 59) {
                System.out.println("Your grade is E");
            } else {
                System.out.println("Invalid score"); // Handle numbers out of range
            }
        } else {
            System.out.println("Invalid input! Please enter a numeric score.");
        }

        scanner.close();
    }
}
