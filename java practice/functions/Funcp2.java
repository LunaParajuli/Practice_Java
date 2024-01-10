//Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class Funcp2 {

  public static void sumOdd(int n){
    int sum =0;
    for(int i=1;i<=n;i++){
      if(i%2==1){
         sum = sum+i;
      }
      
    }
    System.out.println("The sum of odd numbers from 1 to "+n+ " : "+sum);
  }

  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number limit: ");
    int n = sc .nextInt();
    int sum=0;
    sumOdd(n);
   
  }
}
