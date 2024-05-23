//3.Write java program to print Biggest of 3 Numbers using Logical Operators

import java.io.*;
import java.util.*;
class bm{
 void fn(){
 int a,b,c;
 Scanner sc=new Scanner(System.in);
 System.out.print("The number of a:");
 a=sc.nextInt();
 System.out.print("The number of b:");
 b=sc.nextInt();
 System.out.print("The number of c:");
 c=sc.nextInt();
 if (a>b && a>c)
   System.out.print("a is the biggest number");
 else if(b>a && b>c)
   System.out.print("b is the biggest number");
 else
   System.out.print("c is the biggest number");
  
}
}

class big_num{
public static void main(String args[]){
bm obj=new bm();
obj.fn();
}

}