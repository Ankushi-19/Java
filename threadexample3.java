//6. Write a program to implement the concept of threading by implementing Runnable Interface

import java.io.*;
import java.util.*;
class mythreadrunnable1 implements Runnable{
    public void run(){
        System.out.println("Hello");
        System.out.println("My name is Ankushi");
        System.out.println("Hello");
        System.out.println("My name is Ankushi");
       
        
    }
}

class mythreadrunnable2 implements Runnable{
    public void run(){
        System.out.println("this is  example of runnable thread");
        System.out.println("this is  example of runnable thread");
        System.out.println("this is  example of runnable thread");
        
    }
}





public class threadexample3 {
    public static void main(String[] args) {
        mythreadrunnable1 ref1=new mythreadrunnable1();
        Thread ref2=new Thread(ref1);
        ref2.start();

        mythreadrunnable2 ref3=new mythreadrunnable2();
        Thread ref4=new Thread(ref3);
        ref4.start();

        
    }
}
