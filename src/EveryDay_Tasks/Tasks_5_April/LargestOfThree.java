package EveryDay_Tasks.Tasks_5_April;

public class LargestOfThree {
    // 6) Find the Largest of Three Numbers

    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;
        if (a >= b && a >= c) System.out.println("Largest: " + a);
        else if (b >= a && b >= c) System.out.println("Largest: " + b);
        else System.out.println("Largest: " + c);
    }
}

