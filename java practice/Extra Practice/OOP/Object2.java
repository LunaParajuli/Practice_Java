/*  
2. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
 
 */

class Dog{
    private String name;
    private String breed;

public Dog(String name ,String breed){
     this.name = name;
     this.breed = breed;
}

public String getname(){
  return name;
}
public void setname(String name){
this.name = name;
}

public String getbreed(){
  return breed;
}
public void setbreed(String breed){
  this.breed = breed;
}

}


public class Object2 {
  public static void main(String args[]){
        Dog dog1 = new Dog("Tommy", "Bulldog")  ;
        Dog dog2 = new Dog("Tiger ","German Shepherd ");

        System.out.println(dog1.getname() +" is a "+ dog1.getbreed());
        System.out.println(dog2.getname() +" is a "+ dog2.getbreed());

        System.out.println("Setting the new names and breed of dogs. ");

        dog1.setname("Furry");
        dog1.setbreed("Pomeranian");

        dog2.setname("Hero");
        dog2.setbreed("Labrador Retriever");

        System.out.println(dog1.getname()+" is a "+dog1.getbreed());
        System.out.println(dog2.getname()+" is a "+dog2.getbreed());
  }
}
