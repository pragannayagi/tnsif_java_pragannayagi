package Listinterface.java;

import java.util.List;
import java.util.ArrayList;

public class StudentListMain {
    public static void main(String[] args) {
        // Create a List of Student objects
        List<Student> students = new ArrayList<>();

        // Add Student objects to the list
        students.add(new Student("Pragannayagi", 101));
        students.add(new Student("Keerthi", 102));
        students.add(new Student("Anu", 103));

        // Display students using for-each loop
        System.out.println("Student List:");
        for (Student s : students) {
            s.display();
        }

        // Remove a student
        students.remove(1); // removes Keerthi

        System.out.println("\nAfter removing second student:");
        for (Student s : students) {
            s.display();
        }
    }
}
