//4.Write a java program to print first 10 numbers in Fibonacci series. Also print their sum..

import java.io.*;
import java.util.*;
class fibonacci
{
  void fn(){
   int a,b,c,s=0;
   Scanner sc=new Scanner(System.in);
  int n=10;
   a=0;
   b=1;
   for(int i=1;i<=n;i++)
     {
       c=a+b;
       a=b;
       b=c;
       System.out.println(c);
       s=s+c;    
     }
   
   System.out.println(s);
}
}

class fibo{
public static void main(String args[]){
  fibonacci obj=new fibonacci();
  obj.fn();

}
}
   