//Write a Java method to find the smallest number among three numbers.

import java.util.*;

  class Func1
  {
     public static void smallNum(int a, int b, int c){
        if(a<b && a<c){
          System.out.println("The smallest number is:"+a);
        }
        else if (b<a && b<c) {
          System.out.println("The smallest number is:"+b);
        } else {
          System.out.println("The smallest number is:"+c);
        }
        return;
     }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the value of a: ");
      int a = sc.nextInt();

      System.out.print("Enter the value of b: ");
      int b = sc.nextInt();

      System.out.print("Enter the value of c: ");
      int c = sc.nextInt();

      smallNum(a,b,c);       
     

    }
}

