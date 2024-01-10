// Enter 3 numbers from the user & make a function to print their average.

import java.util.*;

public class Funcp1 {
  public static double avgNum(double a, double b , double c){
        return ((a+b+c)/3);
  }
public static void main(String []args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number: ");
  double a = sc.nextDouble();

  System.out.println("Enter the second number: ");
  double b = sc.nextDouble();

  System.out.println("Enter the third number: ");
  double c = sc.nextDouble();

  double result = avgNum(a,b,c);
  System.out.println("The average of three numbers is: " +result);
}  


}
