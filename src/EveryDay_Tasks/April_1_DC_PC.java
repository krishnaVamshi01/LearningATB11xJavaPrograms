package EveryDay_Tasks;

import java.sql.SQLOutput;

public class April_1_DC_PC {
    //    Create a Class with the Person - where we have DC, PC , two types.
    public static void main(String[] args) {
        PPerson P1 = new PPerson();
        P1.name = "krish";
        P1.age = 24;

        // Print after setting the values
        System.out.println("name: " + P1.name);
        System.out.println("age: " + P1.age);
        System.out.println("------------------");


        // Calls the parameterized constructor
        PPerson P2 = new PPerson("VAMSHI", 24);
        System.out.println("name: " + P2.name);
        System.out.println("age: " + P2.age);


    }

}
    class PPerson {
        String name;
        int age;

        //    Default constructor
        PPerson() {
            System.out.println("Default constructor");
        }


//PARAMETRIXED CONS

        PPerson(String name, int age) {
            this.name = name;
            this.age = age;
            System.out.println("parametrized constructor");
        }
    }
