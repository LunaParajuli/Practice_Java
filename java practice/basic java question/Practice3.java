//Write a program to print an integer entered by the user.
   
  import java.util.Scanner;

  public class Practice3 {
    public static void main(String []args){
      int number;
      Scanner reader = new Scanner(System.in);
      System.out.print("Enter any integer number:");
       number = reader.nextInt();

      System.out.println("The integer number is:" +number);
    }
}
