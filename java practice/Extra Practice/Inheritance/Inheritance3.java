/*
 Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.
 */

class Shape{
   public int  getArea(){
         return 0;
   }
}

class Rectangle extends Shape{
 
  int length;
  int breadth;

  public Rectangle(int length,int breadth){
       this.length = length;
       this.breadth = breadth;
  }
 @Override
     public  int getArea(){
      return length*breadth;
     }
     
}

public class Inheritance3 {
  public static void main(String args[]){
     
     Rectangle rectangle = new Rectangle(3,4);
    int  area = rectangle.getArea();
    System.out.println("The area of rectangle is: "+area);
  }
}
