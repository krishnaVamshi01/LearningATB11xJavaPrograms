package EveryDay_Tasks.Encapsulation;

public class InheritanceTest {
    public static void main(String[] args) {
        // Single Inheritance
        StudentSingle ss = new StudentSingle();
        ss.display();
        ss.showStudent();

        // Multilevel
        JavaStudent js = new JavaStudent();
        js.display();
        js.showStudent();
        js.codeJava();

        // Hierarchical
        Teacher t = new Teacher();
        t.display();
        t.teach();
    }
}
// 3. Inheritance Examples
// Single Inheritance
class Person {
    void display() {
        System.out.println("I am a person");
    }
}

class StudentSingle extends Person {
    void showStudent() {
        System.out.println("I am a student");
    }
}

// Multilevel Inheritance
class JavaStudent extends StudentSingle {
    void codeJava() {
        System.out.println("I am coding in Java");
    }
}

// Hierarchical Inheritance
class Teacher extends Person {
    void teach() {
        System.out.println("I am teaching");
    }
}

