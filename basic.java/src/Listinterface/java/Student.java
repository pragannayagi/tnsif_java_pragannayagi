package Listinterface.java;

public class Student {
    private String name;
    private int id;

    // Constructor
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

