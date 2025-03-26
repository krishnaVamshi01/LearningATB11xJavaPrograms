package EveryDay_Tasks;
import javax.naming.Name;
import java.util.Scanner;

public class march_14th_CLI_Options {
    public static void main(String[] args) {

        //    Take a user input - Name, Age and Salary and print them in the end.


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String Name = scanner.nextLine();

        System.out.println("enter your age");
        int age = scanner.nextInt();

        System.out.println("enter your salry");
        double Salary = scanner.nextDouble();

        System.out.println("your name is"+Name+ " your age is "+age +"and your salary is "+ Salary);


    }

}

