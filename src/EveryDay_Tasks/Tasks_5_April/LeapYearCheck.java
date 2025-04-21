package EveryDay_Tasks.Tasks_5_April;

public class LeapYearCheck {
    // 9) Check if a Year is a Leap Year

    public static void main(String[] args) {
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println(year + " is a Leap Year");
        else
            System.out.println(year + " is not a Leap Year");
    }
}
