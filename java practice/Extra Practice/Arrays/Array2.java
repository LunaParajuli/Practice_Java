/* Write a Java program to sum values of an array. */
 

/* 
public class Array2 {
  public static void main(String args[]){
  int sumArray[] = {56,44,36,64};

  // int sum = sumArray[0]+sumArray[1]+sumArray[2]+sumArray[3];

  int sum =0;
  for(int i=0;i<4;i++){
     sum = sum+sumArray[i];
  }
   System.out.println("The sum values of an array: "+sum);
  }
}
*/

import java.util.*;

public class Array2{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size of arrays: ");
    int  size = sc.nextInt();

    int sumArray[] = new int[size];

    //Input
    System.out.println("Enter the array of numbers: ");
   for(int i=0;i<size;i++){
       sumArray[i] = sc.nextInt();
  }
    
//Output
  int sum =0;
  for(int i=0;i<size;i++){
  sum = sum+sumArray[i];
  }
  System.out.println("The sum values of an array: "+sum);
  }
}


