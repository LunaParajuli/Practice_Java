//Searching for an element x in a matrix.

import java.util.*;

public class Array2 {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter the size of rows: ");
    int rows= sc.nextInt();
    
    System.out.print("Enter the size of columns: ");
    int cols= sc.nextInt();

    
    int num[][]= new int[rows][cols];

    System.out.println("Enter the inputs: ");
    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<cols;j++){
        num[i][j]=sc.nextInt();
      }
    }
    System.out.print("Enter the value of x: ");
    int x= sc.nextInt();

    for(int i=0;i<rows;i++)
    {
      for(int j=0;j<cols;j++){
        if(num[i][j]==x)
        {
          System.out.println("The location of x is ( "+i+" , "+j+" )");
        }
      }
    }


    


   }
}
