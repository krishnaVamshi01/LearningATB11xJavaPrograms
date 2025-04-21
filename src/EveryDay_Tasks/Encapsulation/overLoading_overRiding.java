package EveryDay_Tasks.Encapsulation;

public class overLoading_overRiding {

    public static void main(String[] args) {
        // Overloading
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 numbers: " + calc.add(2, 3));
        System.out.println("Sum of 3 numbers: " + calc.add(2, 3, 5));

        // Overriding
        Vehicle v = new Vehicle();
        v.run();

        Car c = new Car();
        c.run();
    }
}


// 4. Overloading and Overriding
class Calculator {
    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Car extends Vehicle {
    // Method Overriding
    @Override
    void run() {
        System.out.println("Car is running fast");
    }
}



