// write a java program that prints the season name corresponding to its month number using if-else and switch-case statement.

import java.io.*;
import java.util.*;
public class season_9{
 public static void main(String args[]){
   String season=" ";
   System.out.println("Enter any months from 1 to 12: ");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
if(n<=12)
{
   switch(n)
 {
   case 12:
   case 1:
   season="Winter";
   break;
   case 2:
   case 3:
   season="Spring";
   break;
   case 4:
   case 5:
   case 6:
   season="Summer";
   break;
   case 7:
   case 8:
   case 9:
   season="Monsoon";
   break;
   case 10:
   case 11:
   season="Autumn";
   break;
   default:
   season = "Invalid Month";  // This should never be reached
   break;
 }
}
else{
   season="Bogus Month";
}
System.out.println("the entered month is in the " + season + ".");
}
}




