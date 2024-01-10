/*
 5. Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.
 */

class Book{
  String title;
  String author;
  int ISBN;

public Book(String title,String author, int ISBN){
  this.title= title;
  this.author= author;
  this.ISBN= ISBN;
} 
public String gettitle(){
   return title;
} 
public String getauthor(){
  return author;
}
public int getISBN(){
  return ISBN;
}

}


public class Object5 {
  public static void main(String args[]){
    Book book1 = new Book("China Harayeko Manxe","Haribansha Acharya",100123);

    System.out.println("The name of boook 1 is "+book1.gettitle()+" written by "+book1.getauthor()+" and the ISBN number is "+book1.getISBN());
  }
}
