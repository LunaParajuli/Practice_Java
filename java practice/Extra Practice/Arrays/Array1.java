/* Write a Java program to sort a numeric array and a string array. */

import java.util.*;

public class Array1{
  public static void main(String args[]){
    //numeric array
   
    int[] numericArray = {1234,8769,4527,6789,0123,5703,8973,9035,9832,1111};
    System.out.println("The original numeric array: "+Arrays.toString(numericArray));

    Arrays.sort(numericArray);
    System.out.println("The sorted numeric array is :"+Arrays.toString(numericArray));



    String[] stringArray = {"HTML","CSS","JavaScript","C Programming","C++","PHP","Net Centric","Java","Python","Database"};
      
    System.out.println("The original string array: "+Arrays.toString(stringArray));

    Arrays.sort(stringArray);
    System.out.println("The sorted string array is: "+Arrays.toString(stringArray));



  }
}