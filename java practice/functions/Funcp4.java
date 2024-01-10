//Write a function that takes in the radius as input and returns the
//circumference of a circle

import java.util.*;


public class Funcp4 {

  public static double circleCircum(double r){
        return(Math.PI*2*r);
        
  }
  public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of radius: ");
      double r = sc.nextDouble();
      
      double circumferance = circleCircum(r) ;
      System.out.println("The circumference of a circle is: " +circumferance);
  }
}
