package ex_18_OOPs_Constructor;

public class Lab176_DC {
    public static void main(String[] args) {

        car c1 = new car();
        System.out.println(c1.brand);
        System.out.println(c1.model);
        System.out.println(c1.year);


    }
}
    class car {
        String brand;
        String model;
        int year;


        car() {
            brand = "tata";
            model = "safari";
            year = 2016;
        }
    }
