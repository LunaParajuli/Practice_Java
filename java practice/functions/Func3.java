// Make a function to check if a given number n is even or not.

import java.util.*;

public class Func3 {

  public static void evenNum(int n){
              if(n%2==0){
                System.out.println("The given number "+n+" is even");
              }
              else{
                System.out.println("The given number "+n+" is not even,it is odd.");
              }
  
  return;
  }
  
  public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any number: ");
       
       int n = sc.nextInt();
       evenNum(n);
   
  }
}
