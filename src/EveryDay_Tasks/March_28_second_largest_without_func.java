package EveryDay_Tasks;

import java.util.Scanner;

public class March_28_second_largest_without_func {
    public static void main(String[] args) {

        int[] arr = {12, 24, 16, 17};  // Step 1: Create an array

        int firstLargest = arr[0];  // Step 2: Assume first number is the biggest
        int secondLargest = -1;     // Step 2: Assume second largest is very small

        // Step 3: Find the largest number
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                firstLargest = arr[i];  // Update if a bigger number is found
            }
        }

        // Step 4: Find the second largest number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];  // Update secondLargest
            }
        }

        // Step 5: Print the answer
        System.out.println("Second Largest Number: " + secondLargest);
    }
}