package EveryDay_Tasks;

import java.util.Scanner;

public class March_28_PyramidPattern {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Create a Scanner object for input

            // Step 1: Ask the user for the number of rows
            System.out.println("Enter the number of rows for the pyramid:");
            int rows = sc.nextInt();  // Read the number of rows

            // Step 2: Loop through rows
            for (int i = 1; i <= rows; i++) {
                // First inner loop: Print spaces (to align stars in pyramid shape)
                for (int j = 1; j <= rows - i; j++) {
                    System.out.print(" ");  // Print space
                }

                // Second inner loop: Print stars (*)
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");  // Print star
                }

                System.out.println();  // Move to next line
            }

            sc.close();  // Close the scanner
        }
    }


