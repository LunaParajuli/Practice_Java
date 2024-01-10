//Write a program to remove all whitespaces from the String.


/* 
public class Practice9 {
  public static void main(String []args){
    String str1 = "Remove all the white spaces . ";
    str1 = str1.replaceAll("\\s+",""); 
    System.out.print("After removing whitespaces: "+str1);
  }

  
}
*/
import java.util.Scanner;
class Practice9{
  public static void main(String []args){
    String str;

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any String: ");
    str = sc.nextLine();
    str = str.replaceAll("\\s+","");

    System.out.print("\nAfter removing Whitespace: " +str);
  }
}