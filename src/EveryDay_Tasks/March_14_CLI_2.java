package EveryDay_Tasks;

import java.util.Scanner;

public class March_14_CLI_2 {
    public static void main(String[] args) {

//        Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

        Scanner scanner = new Scanner(System.in);
                int a = scanner.nextInt();
                int b = scanner.nextInt();

//           String Result= (a>b) ? "a is bigger" : "b is bigger";
        System.out.println((a>b) ? "a is bigger" : "b is bigger");




    }
}
