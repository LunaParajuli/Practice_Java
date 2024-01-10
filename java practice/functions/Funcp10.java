/*Write a program to print Fibonacci series of n terms where n is input
by user :
0 1 1 2 3 5 8 13 21 .....
In the Fibonacci series, a number is the sum of the previous 2 numbers that
came before it.
*/

import java.util.*;

public class Funcp10 {
   public static int fib(int n){
      int a=0, b=1,temp;
      if(n==0){
        return a;
      }
      for( int i=2;i<=n;i++){
        temp=b;
        b=a+b;
        a=temp;
      }
    return temp;
   }
   
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter any value: ");
    int n = sc.nextInt();

   // fib(n);
    
    //System.out.println("The fibonacci series upto "+n+" th term is: "+fib(n));  
  }
}
