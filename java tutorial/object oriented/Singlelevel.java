/*Inheritance Types: i) Single-level Inheritance
                    ii) Multi-level Inheritance
                   iii) Hierarchial Inheritance
                    iv)Hybrid Inhertance

                    v)Multiple inheritance= not supported by Java but can be used with the help of interface.
*/

import java.util.*;
import bank;


class Shape{
  public void area(){
    System.out.println("display area");
  }
}

class Triangle extends Shape{
  public void area(int l, int h){
    System.out.println(l/2*l*h);
  }
}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
      System.out.println(l/2*l*h);
    }
}

class Circle extends Shape{
  public void area(int r){
    System.out.println((3.14)*r*r);
  }
}



public class Singlelevel {
  public static void main(String args[]){
    bank.Account account1 = new Account();

    account1.name = "customer1";
  }
}
