//Find the maximum & minimum number in an array of integers.

import java.util.*;

public class Array3 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number size: ");
    int size = sc.nextInt();

    
    int number[] =  new int[size];

    //Input
    System.out.println("The numbers are: ");

    for(int i=0;i<size;i++)
    {
      number[i]=sc.nextInt();
    }

    int max = number[0];
    int min = number[0];


    //Output
    for(int i=0;i<number.length;i++){
         if(max<number[i])
         {
          max = number[i];
          
         }

         if(min>number[i])
         {
          min = number[i];
          
         }
    }
    System.out.println("The maximum number in arrray of  givenintegers is: " +max);
    System.out.println("The minimum number in arrray of given integers is: " +min);



      
  }
}
