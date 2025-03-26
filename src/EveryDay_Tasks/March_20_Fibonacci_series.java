package EveryDay_Tasks;
import java.util.Scanner;

public class March_20_Fibonacci_series {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of terms:"); // Asking user for input
        int number = scanner.nextInt(); // Taking input for number of terms

        int i = 0;
        int first = 0;
        int second = 1;  // Fibonacci series starts with 0 and 1

        // int next = first + second; ❌ This is incorrect because it should be inside the loop

        for (i = 0; i < number; i++) {
            System.out.println(first); // ✅ Print the current term

            // Mistake in your code: You were printing only 'second' and not updating values.

            int next = first + second; // ✅ Calculate the next term in the sequence
            first = second;  // ✅ Update first to the previous second
            second = next;   // ✅ Update second to the newly calculated next term
        }
    }
}
