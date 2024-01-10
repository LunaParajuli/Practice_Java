//Print sum of first n natural numbers.

public class SumNatural {
public static void naturalNumb(int i,int n,int sum){
   if(i == n){
      sum += i;
      System.out.println(sum);
      return;
   }
   sum += i;
   naturalNumb(i+1,n,sum);
}   
  public static void main(String args[]){
      naturalNumb(1,5,0);
  }
}
