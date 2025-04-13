package EveryDay_Tasks;

public class April_1_DC_PC {
    public static void main(String[] args) {
        // Creating object using Default Constructor
        PPerson P1 = new PPerson();
        P1.name = "Krish";
        P1.age = 24;
        P1.Address = "Hyderabad";
        P1.PhoneNo = 9876543210L;
        P1.isMale = true;

        // Printing values set manually
        System.out.println("name: " + P1.name);
        System.out.println("age: " + P1.age);
        System.out.println("------------------");

        // Calling behavior methods
        P1.eat();
        P1.sleep();
        P1.walk();
        P1.doHome();
        P1.printDetails();

        System.out.println("====================");

        // Creating object using Parameterized Constructor
        PPerson P2 = new PPerson("Vamshi", 24);
        P2.Address = "Nizamabad";
        P2.PhoneNo = 9876501234L;
        P2.isMale = true;

        // Calling behavior methods for P2
        P2.eat();
        P2.sleep();
        P2.walk();
        P2.doHome();
        P2.printDetails();
    }
}

// Class representing a Person
class PPerson {
    // Instance variables / fields
    String name;
    int age;
    String Address;
    long PhoneNo;
    Boolean isMale;

    // Default Constructor (DC)
    PPerson() {
        System.out.println("Default constructor called");
    }

    // Parameterized Constructor (PC)
    PPerson(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    // Behaviors (methods)
    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void walk() {
        System.out.println(name + " is walking");
    }

    void doHome() {
        System.out.println(name + " is at home");
    }

    // Method to print all details of the person
    void printDetails() {
        System.out.println("----- Person Details -----");
        System.out.println("Name    : " + name);
        System.out.println("Age     : " + age);
        System.out.println("Address : " + Address);
        System.out.println("Phone   : " + PhoneNo);
        System.out.println("Is Male : " + isMale);
        System.out.println("--------------------------");
    }
}
