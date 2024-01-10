//Write a program to print an String entered by the user.

import java.util.Scanner;

public class Practice4 {
   public static void main(String []args){
    String string;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String: ");

    string = sc.nextLine();

    System.out.print("Typed String is: " +string);
   }
}
