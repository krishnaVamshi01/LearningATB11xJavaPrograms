package EveryDay_Tasks;

import java.util.Scanner;

public class March_14_EvenOrOdd {
    public static void main(String[] args) {
//        Create a Program - Take user input & Check weather the input is even or odd number
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
         int a = scanner.nextInt();
//         int b = scanner.nextInt();

       if (a%2==0){
           System.out.println(a+ " is an even number");
       }
           else{
               System.out.println(a+ " is  an odd number");
           }

    }

}
