//Write a Java program to calculate the sum of natural numbers.(Note:Sum=n(n+1)/2)

/*import java.util.Scanner;

public class Prac6 {
  public static void main(String []args){
    
    int n, sum ;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter any number: ");
    n = sc.nextInt();
    sum = n*(n+1)/2;
    
    System.out.println("The sum of first " +n+ " natural numbers is: " +sum);
    

  }
}*/



import java.util.Scanner;

public class Prac6 {
  public static void main(String []args){
    
    int n, sum = 0 ;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter any number: ");
    n = sc.nextInt();
    for(i=1;i<=n;i++){
      sum=sum+i;
    }
    
    System.out.println("The sum of first " +n+ " natural numbers is: " +sum);
    

  }
}