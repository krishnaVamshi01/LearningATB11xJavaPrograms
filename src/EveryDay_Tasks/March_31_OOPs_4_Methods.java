package EveryDay_Tasks;


public class March_31_OOPs_4_Methods {
    public static void main(String[] args) {

        person p = new person();

        // 1. Without Parameters and Without Return Type
        p.display();

        // 2. Without Parameters but With Return Type
        System.out.println(p.getDetails());

        // 3. With Parameters and Without Return Type
        p.setInfo("Indian", 6.1, false);

        // 4. With Parameters and With Return Type
        String output = p.getAddressAndWeight("10-1 Santoshnagar, Karimnagar", 80.1);
        System.out.println(output);




    }


}

class person {
    String name;
    int age;
    String Occupation;
    long PhoneNo;
    String Gender;
    String Nationality;
    Double height;
    Boolean isMarried;
    String Address;
    Double weight;

    // 1. Without Parameters and Without Return Type
    void display() {
        name = "Krishna Vamshi";
        age = 25;
        Occupation = "QA Engineer";
//print the values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Occupation: " + Occupation);

    }

    // 2. Without Parameters but With Return Type
    String getDetails() {
        return "PhoneNo: " + 7034572452L + "\nGender: " + "Male";

    }

    // 3. With Parameters and Without Return Type
    void setInfo(String nationality, double height, boolean isMarried) {
        this.Nationality = nationality;
        this.height = height;
        this.isMarried = isMarried;

        System.out.println("Nationality: " + Nationality);
        System.out.println("Height: " + height);
        System.out.println("Is Married: " + isMarried);
    }

    // 4. With Parameters and With Return Type
    String getAddressAndWeight(String address, double weight) {
        this.Address = address;
        this.weight = weight;

        return "Address: " + Address + "\nWeight: " + weight;
    }


}

