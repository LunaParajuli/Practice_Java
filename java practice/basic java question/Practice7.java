//Write a program to swap two numbers.

public class Practice7 {
  public static void main(String []args){
    int a,b,temp;

     a = 1;
     b = 2; 
    System.out.println("Before swapping:a = "+a+  "b = "+b);

    temp = a;
    a = b;
    b = temp;

    System.out.println("After swapping a = "+a+  "b = "+b);
  }
}
