 //Write a Java method to compute the average of three numbers.
 
 import java.util.*;

 class Func2 {

  public static int avgNum(int a,int b, int c){
    int avg = (a+b+c)/3;
    return avg;
  }
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter the value of a: ");
     int a = sc.nextInt();

     System.out.print("Enter the value of b: ");
     int b = sc.nextInt();

     System.out.print("Enter the value of c: ");
     int c = sc.nextInt();

     int avg = avgNum(a,b,c);
     System.out.println("The average of given three numbers is: "+ avg);

  }
}
