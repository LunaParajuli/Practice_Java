// maximum & minimum number in java.

public class Array2 {
  public static void main(String args[]){
     System.out.println("The maximum value in java is:"+Integer.MAX_VALUE);
     System.out.println("The minimum value in java is:"+Integer.MIN_VALUE);


     //when max_value+1 is done memory overflows and gives negative numbers.
     //when min_value-1 is done memory overflows and gives positive numbers.
     int N = Integer.MAX_VALUE+1;
     int n = Integer.MIN_VALUE-1;
    
     System.out.println("The (maximum value+1) in java is:"+N);
     System.out.println("The (minimum value-1) in java is:"+n);

  }
}
