package EveryDay_Tasks.Task_06_Feb;

import java.util.Scanner;

public class DivisibleBy5And11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check if number is divisible by both 5 and 11
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println("Yes, " + num + " is divisible by both 5 and 11.");
        } else {
            System.out.println("No, " + num + " is not divisible by both 5 and 11.");
        }
    }
}

