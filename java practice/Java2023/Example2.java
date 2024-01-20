import java.util.*;
class Example2 
 { 
   public static void main (String []args)
    {
      String name;
      String address;
      System.out.print("Enter your name:");
      System.out.print("Enter your address:");
      Scanner sc= new Scanner(System.in);
      name=sc.nextLine();
      address=sc.nextLine();
      System.out.print("Name:"+name+"\t" +"Address:"+address);
      
    }
  }
   