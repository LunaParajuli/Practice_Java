//Write a Java program to check whether a character is a vowel or consonant.

import java.util.Scanner;

class Prac2{
  public static void main (String args[]){

    Character s;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any character: " );
     
    
    s = sc.next().charAt(0);
    if(s == 'a'||s == 'e'|| s == 'i'|| s == 'o'||s == 'u') {
      System.out.println("The character" +s+ "is vowel.");
    }
    else{
      System.out.print("The character" +s+ " is consonant.");
    }
    
    

  }
}