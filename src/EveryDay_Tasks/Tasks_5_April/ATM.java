package EveryDay_Tasks.Tasks_5_April;

import java.util.Scanner;

public class ATM {
// 13) ATM Withdrawal Simulation

    public static void main(String[] args) {
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        if (amount <= 0 || amount % 100 != 0) System.out.println("Invalid amount");
        else if (amount > balance) System.out.println("Insufficient balance");
        else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining balance: " + balance);
        }
    }
}

