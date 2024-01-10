//Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*;

public class Funcp3 {

  public static void greaterNum(int a, int b){
    if(b<a){
      System.out.println("The number "+a+" is greater than number "+b+" .");
    }
    else{
      System.out.println("The number "+b+" is greater than number "+a+" .");
    }
  }
  public static void main(String []args){

       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the value of a: ");
       int a = sc.nextInt();

       System.out.println("Enter the value of b: ");
       int b = sc.nextInt();

       greaterNum(a,b);

  }
}
