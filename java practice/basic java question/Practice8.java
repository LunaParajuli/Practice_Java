//Write a program to calculate the square of a number.

import java.util.Scanner;

public class Practice8 {
  public static void main(String []args){
    double num,Square;
    Scanner sq = new Scanner(System.in);
    System.out.print("Enter any number:");
    num = sq.nextDouble();
    Square = num*num;
    System.out.println("The Square of "+num +"="+Square);

  }
  
}
