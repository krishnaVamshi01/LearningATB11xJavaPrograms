package EveryDay_Tasks;

import java.util.Scanner;

public class March_28_Odd_Even_From_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for input

        // Step 1: Ask user for array size
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();  // Read the size of the array

        int[] arr = new int[size];  // Create an array of given size

        // Step 2: Take input for array elements
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();  // Store user input in the array
        }

        // Step 3: Print even numbers
        System.out.println("Even numbers:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {  // Check if number is even
                System.out.print(arr[i] + " ");  // Print even number
            }
        }

        // Step 4: Print odd numbers
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {  // Check if number is odd
                System.out.print(arr[i] + " ");  // Print odd number
            }
        }

        sc.close();  // Close the scanner
    }
}

