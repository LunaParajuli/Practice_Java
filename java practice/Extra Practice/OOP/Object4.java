/* 
4. Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle. 
 
*/

class Circle{
  double radius;

public Circle(double radius){
  this.radius = radius;
}
public double getradius(){
  return radius;
}
public void setradius(double radius){
  this.radius = radius;
}

public double getarea(){
  return 3.14*radius*radius;
}
public double getcircum(){
  return 2*3.14*radius;
}
}

public class Object4 {
  public static void main(String args[]){
    Circle circle1 = new Circle(5.3);
    System.out.println("The area of cirlce is: "+circle1.getarea());
    System.out.println("The circumferance  of cirlce is: "+circle1.getcircum());

    System.out.println("Set the new values of area and circumferance for cirlce.");
    circle1.setradius(3);
     System.out.println("The new  area of cirlce is: "+circle1.getarea());
    System.out.println("The new circumferance  of cirlce is: "+circle1.getcircum());
  }
}
