/*Take an array of numbers as input and check if it is an array sorted in
ascending order.
Eg : { 1, 2, 4, 7 } is sorted in ascending order.
{3, 4, 6, 2} is not sorted in ascending order.          */

import java.util.*;

public class Array5 {
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size of number array:"); 

   int size = sc.nextInt();

   int num[] = new int[size];
   
   //Input
   System.out.println("Enter the numbers as input: ");
   for(int i=0;i<size;i++)
   {
    num[i] = sc.nextInt();
   }
   //Output
   boolean isAscending = true;
   for(int i=0;i<num.length-1;i++)  //num.length-1 is termination condition
   {
     if(num[i]>num[i+1])
     {
       if(num[i]>num[i+1])
       {
         isAscending = false;
       }
     }
   } 
     if(isAscending) 
     {
      System.out.println("The array is sorted in ascending order.");
      } 
      else 
      {
      System.out.println("The array is not sorted in ascending order.");
      } 
   
  }
}
