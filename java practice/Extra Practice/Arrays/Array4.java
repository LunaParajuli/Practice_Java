/* Write a Java program to print the following grid.

Expected Output :
   ----------
   ----------
   ----------
   ----------
   ----------
   ----------
   ----------
   ----------
   ----------
   ----------
   
 */

public class Array4 {
   public static void main(String args[]){

      String gridArray[][] = new String[10][10];
    
      for(int i=0;i<10;i++){
        for(int j=0;j<10;j++){
          System.out.print("-"+" ");
        }
        System.out.println("-");
      }

   }
}
