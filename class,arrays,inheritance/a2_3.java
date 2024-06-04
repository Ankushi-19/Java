//3. Write a Java Program to find the largest and smallest element from an array.
import java.io.*;
import java.util.*;
class a2{
   
    void fn(int arr[]){
        if (arr==null|| arr.length==0){
            System.out.println("thevarray is empty");
        }    
        int l=arr[0]; 
        int s=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>l){
                l=arr[i];
            }
            if(arr[i]<s){
               s=arr[i];
            }  
        }   
        System.out.println("the largest value of an array:"+l);
        System.out.println("the smallest value of an array:"+s);
    }
}
public class a2_3 {
    public static void main(String[] args) {
        int arr[]={56,78,64,12,34};
        a2 obj=new a2();
        obj.fn(arr);
    }
}
