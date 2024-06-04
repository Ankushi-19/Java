// 6. WAP using parameterized constructor with two parameters id and name. While creating the objects obj1 and
// obj2 passed two arguments so that this constructor gets invoked after creation of obj1 and obj2.
import java.io.*;
import java.util.*;

class Person {
    private int id;
    private String name;
    // Parameterized constructor
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
    // Method to print the student data
    public void printData() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
// Main class to demonstrate the creation of objects using the parameterized constructor
public class a2_6{
    public static void main(String[] args) {
        // Create two Student objects using the parameterized constructor
        Person ob1 = new Person(1, "Ankushi");
        Person ob2 = new Person(2, "Dipta");

        // Print the data of the students
        System.out.println("The data of student1:");
        ob1.printData();
        System.out.println();
        System.out.println("The data of student2:");
        ob2.printData();
    }
}

