// 1.Write a Java Program to implement array of objects.
import java.io.*;
import java.util.*;
class a2{
    
            String name;
            int age;
            String Gender;
            String Address;
          // Constructor
            public a2(String name, int age,String Gender,String Address) {
                this.name = name;
                this.age = age;
                this.Gender=Gender;
                this.Address=Address;
            }
           // Method to display 
            void fun(){
                System.out.println("Name: " + name+" " + ", Age: " + age +" " +", Gender:"+ Gender +" "+" , Address:" +Address);
            }
        }
public class a2_1 {
    public static void main(String[] args) {
        a2[] people = new a2 [3];

        
        people[0] = new a2 ("Ankushi", 22,"Female","Siliguri");
        people[1] = new a2("Dipta", 22,"Male","Jalpaiguri");
        people[2] = new a2("Shaym", 35,"Male","Asanshole");

        for (int i = 0; i < people.length; i++) {
            people[i].fun();
        }
    }
}
