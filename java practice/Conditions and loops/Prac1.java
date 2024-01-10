//Write a Java program to check if the number is odd or even.

import java.util.Scanner;

class Prac1{
  public static void main (String args[]){

    int n;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number: " );
     
    n = sc.nextInt();
    if(n%2 == 0){
      System.out.print("The number" +n+ "is even.");
    }
    else{
      System.out.print("The number" +n+ "is odd.");
    }
    
    

  }
}