package EveryDay_Tasks.Tasks_5_April;

public class ValidTriangle {

    // 14) Check if a Triangle is Valid Based on Three Sides

    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        if (a + b > c && a + c > b && b + c > a)
            System.out.println("Valid Triangle");
        else
            System.out.println("Invalid Triangle");
    }
}

