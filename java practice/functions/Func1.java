// Make a function to check if a number is prime or not.

import java.util.*;

class Func1{

    public static int prime(int n){
         int div=2;
         while (div<n)
         {
            if(n%div==0){
             System.out.println("The given number "+n+" is not prime number.");
            }
            else{
                 System.out.println("The given number "+n+" is not prime number.");
            }
          div = div+1;
         }
              
         return n;
      }
    

          
public static void main (String []args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter any number: ");

   int n = sc.nextInt();
     
   System.out.println(prime(n));
}
       
}