// Write a function to multiply 2 numbers.

import java.util.*;

public class Func2 {
    public static int multiply(int a, int b){
      return a*b;
      
    }

    public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a: ");
      int a = sc.nextInt();
      System.out.println("Enter the value of b: ");
      int b = sc.nextInt();

      int result = multiply(a,b);
      System.out.println("The multiplication of "+a+ " and " +b+ " is: "+result);
    }
 }