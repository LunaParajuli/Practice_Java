//Two numbers are entered by the user, x and n. Write a function to find
//the value of one number raised to the power of another i.e. 𝑥 .

import java.util.*;

public class Funcp8 {
  public static void powerFun(int x , int n){
    int ans=1;
    for(int i=0;i<n;i++){
      ans = ans*x;
     }
       
  }


  public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the the value of x: ");
     int x = sc.nextInt();

     System.out.println("Enter the the value of n: ");
     int n = sc.nextInt();

     powerFun(x,n);
     int ans;
     
     System.out.println("The vlaue of "+x+" to the power of "+n+" is: " +ans);
  }
}
