package javajen;


public class Student {
    
    String name;
    int rollNumber;
    int age;
    String course;

    Student(String name, int rollNumber, int age, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        
        Student student = new Student("John Doe", 101, 20, "Computer Science");

        student.displayDetails();
    }

}


   

