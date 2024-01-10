//Write a Java program to check whether a number is positive, negative, or zero.

import java.util.Scanner;

class Prac3{
  public static void main(String []args){
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number: ");
    n = sc.nextInt();

    if(n == 0){
      System.out.println("The number "+n+" is zero.");
    }
    else if(n>0){
              System.out.println("The number "+n+" is positive.");
    }
    else if(n<0){
            System.out.println("The number "+n+" is negative.");
    }
    else{ 
       System.out.println("Please enter valid number!");
    }
  }
}

