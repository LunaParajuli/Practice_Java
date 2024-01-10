/* Write a Java method to count all vowels in a string.

Test Data:
Input the string: w3resource

Expected Output:
Number of  Vowels in the string: 4 
*/


import java.util.*;

public class Func4 {

   public static int countVowels( String str){

    int count = 0;

    for(int i=0;i<str.length();i++){
     if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i'|| str.charAt(i) =='o'|| str.charAt(i) =='u')    
     {
        count++;
     }
    }
    return count;
    
   }

   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("The input string is: ");
    String str = sc.nextLine();

    System.out.println("Number of vowels in the string: " +countVowels(str));
   }
}
