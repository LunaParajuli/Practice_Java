/*
 2. Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".
 */

class Vehicle{
  public void driveMethod(){
    System.out.println("The driver drives the vehicle.");
  }
}
class Car extends Vehicle{
  @Override
  public void driveMethod(){
    System.out.println("Repairing a car.");
  }
}

public class Inheritance2 {
  public static void main(String args[]){
   Vehicle vehicle = new Vehicle();
   Car car = new Car();
   vehicle.driveMethod();
   car.driveMethod();
  }
}
