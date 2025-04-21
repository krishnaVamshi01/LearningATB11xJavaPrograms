package EveryDay_Tasks.Tasks_5_April;

public class SmallestOfThree {
    // 8) Find the Smallest of Three Numbers

    public static void main(String[] args) {
        int a = 9, b = 6, c = 12;
        if (a <= b && a <= c) System.out.println("Smallest: " + a);
        else if (b <= a && b <= c) System.out.println("Smallest: " + b);
        else System.out.println("Smallest: " + c);
    }
}

