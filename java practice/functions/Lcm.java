//Write a function that calculates the Lowest Common Multiple of 2 numbers.

import java.util.*;

public class Lcm {
   public static int lcmCal(int a,int b){
     int min;
     int gcd=1;
     int LCM;
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
    LCM= (a/gcd)*b; 
    System.out.println("The LCM of "+a+" and "+b+" is: "+LCM);
    return gcd;
   }


   public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the value of a: ");
    int a = sc.nextInt();

    System.out.println("Enter the value of b: ");
    int b = sc.nextInt();

    lcmCal(a,b);
    
   }
  }   