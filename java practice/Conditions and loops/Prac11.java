//Write a Java program to print 1 to 100 but not 41.

class Prac11{
    public static void main(String []args){
      int i;
      System.out.println("The numbers are: ");
      for( i=1;i<=100;i++){
        if(i!=41){
           System.out.println(i);
        }
       // else{

        //}   
      }
    }
}