//Write a function that takes in age as input and returns if that person is eligible
//to vote or not. A person of age > 18 is eligible to vote.

import java.util.*;

class Funcp5{
 public static void ageVote(int a){
   if(a>=18){
    System.out.println("You are eligible to vote.");
   }
   else{
    System.out.println("You are not eligible to vote.");
   }
 }

  public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your age: ");
      int a = sc.nextInt();
      ageVote(a);
  }
}