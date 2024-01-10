
class Student{
  String name;
  int age;

  public void printInfo(){
    System.out.println(this.name);
    System.out.println(this.age);
  }

  // Student(){
  //   System.out.println("Constructor called.");
  //  }        // Non-parameter constructor.


  // 
  
  Student (Student s2){
    this.name = s2.name;
    this.age  = s2.age;
  } 
  Student(){
    
  }
}
public class Prac2{
  public static void main(String args[]){

     Student s1 = new Student();
     s1.name = "Luna";
     s1.age = 23;

     s1.printInfo();

    Student s2 = new Student(s1);
    s2.printInfo(); 
     
  }
}