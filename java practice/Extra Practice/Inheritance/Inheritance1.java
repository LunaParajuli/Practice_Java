/*
 1. Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.
 */

 class Animal{
    public  void makeSound(){
      System.out.println("The animal makes a sound.");
    }
}


 class Cat extends Animal{
   @Override
      public void makeSound(){
        System.out.println("The cat does meow meow.");
      }
}

public class Inheritance1{
  public static void main(String args[]){
     Animal animal = new Animal();
     Cat cat = new Cat();
     animal.makeSound();
     cat.makeSound();
  }
 }