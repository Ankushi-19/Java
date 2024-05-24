//5. Write a program to implement the concept of threading by extending Thread Class

import java.io.*;
import java.util.*;
class threadexample2 extends Thread{
    public void run(){
        System.out.println("I am Ankushi");
        System.out.println("I am a student");
    }
        public static void main(String[] args) {
            threadexample2 ref1=new threadexample2();
            ref1.start();
            threadexample2 ref2=new threadexample2();
            ref2.start();
        }
    }



    
