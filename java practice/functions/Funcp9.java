//Write a function that calculates the Greatest Common Divisor of 2 numbers.

import java.util.*;

public class Funcp9 {
   public static int gcdCal(int a,int b){
     int min;
     int gcd=1;
    if(a>b){
        min= b;
      }
      else{
        min= a;
      }

    for(int i=1;i<min+1;i++){
      if(a%i==0 && b%i==0){
        gcd = i;
      }
      
    }  
    System.out.println("The GCD of "+a+" and "+b+" is: "+gcd);
    return gcd;
   }


   public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of a: ");
    int a = sc.nextInt();

    System.out.println("Enter the value of b: ");
    int b = sc.nextInt();

    gcdCal(a,b);
    
   }
}
