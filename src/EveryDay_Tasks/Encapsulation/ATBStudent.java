package EveryDay_Tasks.Encapsulation;

public class ATBStudent {

}
// 1. Encapsulation with Getters and Setters
class Student {
    // Private fields
    private String name;
    private int age;
    private String course;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // toString method to print student details
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", course='" + course + "'}";
    }
}


