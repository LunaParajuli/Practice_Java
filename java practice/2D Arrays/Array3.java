//Print the spiral order matrix as output for a given matrix of numbers.

import java.util.*;

public class Array3 {
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the size of rows of matrix: ");
    int rows = sc.nextInt();
    
    System.out.print("Enter the size of columns of matrix: ");
    int columns = sc.nextInt();

    int matrix[][] = new int[rows][columns];
    
    //Input
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<columns;j++)
      {
        matrix[i][j] = sc.nextInt();
      }
    }
    
   //  Output

   System.out.println("The spiral order matrix as output for a given matrix of numbers: ");

   int row_start = 0;
   int row_end = rows-1;

   int col_start = 0;
   int col_end = columns-1;

   while(row_start<=row_end && col_start<=col_end)
   {

    //1
   for(int column=col_start; column<=col_end; column++) 
   {
     System.out.print(matrix[row_start][column] + " ");
   }
  row_start++;

  //2
  for(int row=row_start; row<=row_end; row++) 
  {
  System.out.print(matrix[row][col_end] +" ");
  }
  col_end--;

  //3
  for(int column=col_end; column>=col_start; column--) 
  {
  System.out.print(matrix[row_end][column] + " ");
  }
  row_end--;
  
  //4
  for(int row=row_end; row>=row_start; row--) 
  {
  System.out.print(matrix[row][col_start] + " ");
  }
  col_start++;

  System.out.println();

   }
  }
}
