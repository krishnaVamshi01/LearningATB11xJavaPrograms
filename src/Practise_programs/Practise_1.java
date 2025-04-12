package Practise_programs;

public class Practise_1 {
//    Question:
//Create a class called Car with the following:
//Three attributes: brand, model, and year.
//A parameterized constructor to initialize the attributes.
//A method called displayCarInfo() to print the car details.
//Then, in the main method, create two car objects with different values and call the method to display their details.

    public static void main(String[] args) {

        car car1 = new car("Tata", "Curvv", 2024);
        car car2 = new car("Hyundai", "Creta", 2023);


        car1.displayCarInfo();
        car2.displayCarInfo();


    }
}

class car{
    String brand;
    String model;
    int year;

    car(String brand,String model,int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
        void displayCarInfo () {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }
    }
