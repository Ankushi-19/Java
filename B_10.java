//10. Write a Java Program to define a class, describe its constructor, overload the Constructors and instantiate its object.

import java.io.*;
import java.util.*;
import java.lang.*;

class A {
    int a;
    double b;
    String c;

    // Default constructor
    A() {
        a = 200;
        b = 56.74;
        c = "Ankushi";
    }

    // Constructor with one int parameter
    A(int y) {
        a = y;
    }

    // Constructor with one double and one String parameter
    A(double x, String z) {
        b = x;
        c = z;
    }
}

public class B_10 {
    public static void main(String args[]){
        A ob = new A();
        A ob1 = new A(300);
        A ob2 = new A(90.45, "Ankushi");

        System.out.println(ob.a + " " + ob.b + " " + ob.c);
        System.out.println(ob1.a);
        System.out.println(ob2.b + " " + ob2.c);
    }
}
