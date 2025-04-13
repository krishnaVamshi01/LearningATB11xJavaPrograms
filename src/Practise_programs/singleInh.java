package Practise_programs;

public class singleInh {
    public static void main(String[] args) {
        // Creating object for Manager
        Manager m1 = new Manager("Krishna", 101, 50000.0, "IT");

        // Calling methods
        m1.printEmployeeDetails();
        m1.printManagerDetails();
    }
}

// Parent class
class Employee {
    String name;
    int empId;
    double salary;

    // Constructor
    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    // Method to print employee details
    void printEmployeeDetails() {
        System.out.println("----- Employee Details -----");
        System.out.println("Name   : " + name);
        System.out.println("Emp ID : " + empId);
        System.out.println("Salary : " + salary);
    }
}

// Child class
class Manager extends Employee {
    String department;

    // Constructor using super()
    Manager(String name, int empId, double salary, String department) {
        super(name, empId, salary); // Call parent constructor
        this.department = department;
    }

    // Method to print manager-specific details
    void printManagerDetails() {
        System.out.println("Department: " + department);
        System.out.println("----------------------------");
    }
}
