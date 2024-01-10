//For a given matrix of N x M, print its transpose.

import java.util.*;

public class Array4 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of rows of matrix: ");
    int rows = sc.nextInt();
    
    System.out.print("Enter the size of columns of matrix: ");
    int columns = sc.nextInt();

    int matrix[][] = new int[rows][columns];
    
    //Input
    System.out.println("Enter the inputs of matrix: ");
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<columns;j++)
      {
        matrix[i][j] = sc.nextInt();
      }
    }

    //output
    System.out.println("The transpose of given matrix: ");
    for(int j=0;j<columns;j++)
    {
      for(int i=0;i<rows;i++)
      {
        System.out.print(matrix[i][j]+" ");
      }
      System.out.println();
    }
  }
}    