package EveryDay_Tasks.Encapsulation;

public class Array_of_ATB_Students {

    // 2. Array of Students

    public static void main(String[] args) {
        // Creating array of students
        Student[] students = new Student[3];

        // Creating and assigning student objects
        Student s1 = new Student();
        s1.setName("Krishna");
        s1.setAge(25);
        s1.setCourse("ATB-11X");

        Student s2 = new Student();
        s2.setName("Vamshi");
        s2.setAge(24);
        s2.setCourse("ATB-10X");

        Student s3 = new Student();
        s3.setName("Sai");
        s3.setAge(23);
        s3.setCourse("ATB-12X");

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Printing all students
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
