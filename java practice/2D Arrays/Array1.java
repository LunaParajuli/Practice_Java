//Taking a matrix as an input and printing its elements.

import java.util.*;

public class Array1{
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter the size of rows: ");
     int rows = sc.nextInt();
    
     System.out.println("Enter the size of columns: ");
     int cols = sc.nextInt();

     System.out.println("Enter the inputs:");
     int num[][] = new int[rows][cols];
     
     //input
     for(int i=0;i<rows;i++)
      {
        for(int j=0;j<cols;j++)
        {
          num[i][j] = sc.nextInt();
        }
      }  
     
      
     //output
     for(int i=0;i<rows;i++)
      {
        for(int j=0;j<cols;j++)
        {
          System.out.print(num[i][j]+" ");
        }
        System.out.println();
      }

  }
}