//Write a function to calculate the factorial of a number.

import java.util.*;

public class Factorial {
  public static int facto(int n){
    int fact =1;
    if(n==0&&n==1){
      return 1;
    }
    for(int i=1;i<=n;i++){
      fact=fact*i;
    }
  return fact;
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();

    
    int fact=facto(n);
    System.out.print("The factorial of "+n+" is: "+fact);
  }
}
