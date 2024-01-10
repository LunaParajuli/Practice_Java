/* Write a Java program to calculate the average value of array elements. */

import java.util.*;

public class Array3 {
   public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("The the size of number array: ");
      int size = sc.nextInt();

     int avgArray[]= new int[size];

     //Input
     System.out.println("Enter the numbers: ");
     for(int i=0;i<size;i++){
         avgArray[i] = sc.nextInt();
     }

     //Output
     double sum=0;
     for(int i=0;i<size;i++){
      
      sum = (sum+avgArray[i]);
     }
    double avg = sum/size;

     System.out.println("The average value of array elements: "+avg);
   }
}
