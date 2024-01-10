/*
 4. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().
 */

class Employee{
  private int salary;
  public Employee(int salary){
     this.salary = salary;
  }
  
  public void work(){
    System.out.println("You are an Employee.");
  } 
  public int getSalary(){
    return salary;
  } 
  
}

class HRManager extends Employee{
  
  public HRManager(int salary){
     super (salary);
  }
@Override
  public void work(){
    System.out.println("HR Manager manages employees.");
  }  
  public void addEmployee(){
    System.out.println("Add Employee.");
  }
}

public class Inheritance4 {
    public static void main(String args[]){
      Employee emplo = new Employee(40000);
      HRManager manager = new HRManager(60000);

      emplo.work();
      manager.work();
      System.out.println("The salary of employee is: "+emplo.getSalary());
      System.out.println("The salary of manager is: "+manager.getSalary());

      manager.addEmployee();

  }
}
