//12. Write a JAVA Program to demonstrate Constructor overloading and Method overloading.
import java.io.*;
import java.util.*;
class Overload{
    private int n;
    //constructor overloading
    public Overload() {
        n = 0; 
    }
    public Overload(int num) {
        this.n = num; // 
    }

    // Method overloading
    public void display() {
        System.out.println("Value of num: " + n);
    }
    public void display(String message) {
        System.out.println(message + " " + n);
    }
    public void display(int value) {
        System.out.println("Value: " + value);
    }
}
public class a2_12 {
    public static void main(String[] args) {
        Overload obj1 = new Overload(); 
        Overload obj2 = new Overload(96); 

        obj1.display(); 
        obj2.display();  
        obj2.display("Number:"); 
        obj2.display(69);
    }
}