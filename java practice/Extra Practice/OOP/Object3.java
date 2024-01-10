/* 
    3. Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

 */

 

class Rectangle{
   double width;
   double height;
  

  public Rectangle(double width,double height) 
   {
    this.width = width;
    this.height = height;
   
   }

  public double getwidth(){
       return width;
  } 
  public void setwidth(double width){
    this.width = width;
  }


  public double getheight(){
    return height;
  }
  public void setheight(double height){
    this.height = height;
  }
  public double getarea(){
    return width*height;
  }
  public double getperimeter(){
    return 2*(width+height);
  }


} 

public class Object3 {
  public static void main(String args[]){
     //Scanner sc = new Scanner(System.in);
     Rectangle rectangle = new Rectangle(5,3);
     
    //  System.out.print("Enter the value of width: ");
    //  double width = sc.nextDouble();

    //  System.out.print("Enter the value of height: ");
    //  double height = sc.nextDouble();


     System.out.println("The area of rectangle is: "+rectangle.getarea());
     System.out.println("The perimeter of rectangle is:" + rectangle.getperimeter());

     System.out.println("setting the new values for area and perimeter of rectangle.");
     
     rectangle.setwidth(7);
     rectangle.setheight(8);

     System.out.println("The new area of rectangle is: "+rectangle.getarea());
     System.out.println("The new perimeter of rectangle is:" + rectangle.getperimeter());

  }
}
