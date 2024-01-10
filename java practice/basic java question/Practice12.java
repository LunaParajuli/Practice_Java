//Write a program to ask the user to enter his/her birth year and print the age

import java.util.Scanner;
import java.util.Calendar;

public class Practice12 {
  public  static void  main(String []args){
     Scanner sc = new Scanner(System.in);
     int year = Calendar.getInstance().get(Calendar.YEAR);
     int myyear, result;


    do{
        System.out.print("Enter your birth year: ");
        myyear = sc.nextInt();

        result = myyear - year;
    }while(result>0);
    System.out.print("You are "+result+"year/s old.");
  }
}