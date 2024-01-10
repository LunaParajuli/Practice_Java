//Write a Java program to create a simple calculator using a switch case.

import java.util.Scanner;

public class Prac10 {
  public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
  
      char operator;

   System.out.println("Choose an operator: +, -, *,/ or %");
    operator = sc.next().charAt(0);

    
    double a,b,Sum,Sub,Mul,Div,Rem;

    System.out.println("Enter the value of a: " );
    a = sc.nextDouble();
    System.out.println("Enter the value of b: " );
    b = sc.nextDouble();

   

    
    switch(operator) {
      case'+':
             Sum = a+b;
             System.out.println("Sum of "+a+ "and "+b+ " is: " +Sum);
            break;
      case'-':
            Sub = a-b;
            System.out.println("Subtraction of "+a+ " and "+b+ " is: " +Sub);
            break;
      case'*':
            Mul = a*b;
            System.out.println("Multiplication of " +a+ " and "+b+ " is: " +Mul);
            break;
      case'/':
            Div = a/b;
            System.out.println("Division of "+a+ " and "+b+ " is: " +Div);
            break;
      case'%':
            Rem = a%b;
            System.out.println("Remainder of "+a+ " and "+b+ " is: " +Rem);
            break;  
      default:
            System.out.println("Please!Enter valid input.");                            
    }


  }
}
