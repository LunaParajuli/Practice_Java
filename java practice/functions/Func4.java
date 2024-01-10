// Make a function to print the table of a given number n.

import java.util.*;

public class Func4 {
  public static void printTable(int n){
    for(int i=1;i<=10;i++){
      System.out.printf("%d * %d = %d\n", n,i,n*i);
    }
    return;
  }
      
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number: ");
    int n = sc.nextInt();
    printTable(n);
    
  

      }
}
