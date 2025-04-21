package EveryDay_Tasks.Task_06_Feb;

import java.util.Scanner;

public class DaysConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of days: ");
        int days = sc.nextInt();

        // 1 year = 365 days, 1 month = 30 days
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        int finalDays = remainingDays % 30;

        System.out.println(days + " days = " + years + " years, " + months + " months, and " + finalDays + " days.");
    }
}
