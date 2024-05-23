//2.Write a program to swap two values using object reference. Your program should have a swap method.

import java.io.*;
import java.util.*;
class sw{
 void fun(){
 int a,b,temp;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter value of a:");
 a=sc.nextInt();
 System.out.println("enter value of b:");
 b=sc.nextInt();
 temp=a;
 a=b;
 b=temp;
 System.out.println("after swaping the value of a:"+a);
 System.out.println("after swaping the value of b:"+b);


}
}

class swap{
public static void main(String args[]){
 sw obj=new sw();
 obj.fun();
 }
}