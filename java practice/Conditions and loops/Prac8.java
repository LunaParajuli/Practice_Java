//Write a Java program to generate multiplication tables of 1 -9.


 class Prac8 {
  public static void main(String []args){
  int n;
      if(n==1 && n==2 && n==2 && n==4 && n==5 && n==6 && n==7 && n==8 && n==9){
        for(int i =1;i<=10;i++){
          
        System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
      } 
      else{
        System.out.println("Please! Enter number from 1-9 only.");
      }
    }    
}
