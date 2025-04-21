package EveryDay_Tasks.Tasks_5_April;

public class PrimeCheck {

    // 12) Check if a Number is Prime
    public static void main(String[] args) {
        int num = 7, count = 0;
        if (num <= 1) System.out.println("Not Prime");
        else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            System.out.println(count == 0 ? "Prime" : "Not Prime");
        }
    }
}