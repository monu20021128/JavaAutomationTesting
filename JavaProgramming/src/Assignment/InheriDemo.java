package Assignment;

class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class
class student extends Person {
    int studentId;
    String course;

    // Constructor using super keyword to call base class constructor
    student(String name, int age, int studentId, String course) {
        super(name, age);
        this.studentId = studentId;
        this.course = course;
    }

    // Method to display student details
    void displayStudentInfo() {
        // Call base class method
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }
}

// Main class
public class InheriDemo{
    public static void main(String[] args) {
        // Create Student object
        student s1 = new student("Monu Sahu", 21, 101, "Computer Science");

        // Display student details
        System.out.println("=== Student Details ===");
        s1.displayStudentInfo();
    }
}
