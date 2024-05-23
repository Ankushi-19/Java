//1.write a java program that calculates factorial of a number

import java.io.*;
import java.util.*;
class factorial
{
  void fn(){
   int n,i,f=1;
   
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a number:");
   n=sc.nextInt();
   for(i=1;i<=n;i++)
   
   {
     f=f*i;
   
   }
   System.out.println(f);
   
  }
}


class fact{
 public static void main(String args[]){
  factorial obj=new factorial();
  obj.fn();
}

}



