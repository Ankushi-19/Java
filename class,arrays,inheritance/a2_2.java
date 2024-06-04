//2. Write a Java Program to implement bubble sort .
import java.io.*;
import java.util.*;
public class a2_2 {
    public static void main(String[] args) {
        int arr[]={90,20,80,10,50,40};
        System.out.println("The original array is:"+Arrays.toString(arr));
        int tmp;
        for(int i=0;i<=arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;

                }
            }
        }
        System.out.println("the sorted array is:"+Arrays.toString(arr));
    }
}
