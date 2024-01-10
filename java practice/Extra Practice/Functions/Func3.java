/* Write a Java method to display the middle character of a string.
Note:
 a) If the length of the string is odd there will be two middle characters.
 b) If the length of the string is even there will be one middle character.

Test Data:
Input a string: 350

Expected Output:
The middle character in the string: 5 
*/

import java.util.*;

public class Func3 {

  public static String midChara(String str){
   
    int position;
    int length;

      if(str.length()%2 == 0){
        position = str.length()/2-1;
         length = 2;
      }
      else{
        position = str.length()/2;
        length = 1;
      }
      return str.substring(position,position+length);
  }
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);

      System.out.print("Input a string: ");
      String str = sc.nextLine();
      System.out.println("The middle character in the string: "+midChara(str));
      

  }
}
