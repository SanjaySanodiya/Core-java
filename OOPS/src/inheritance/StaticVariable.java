package inheritance;

/*
The static keyword in Java is used for memory management mainly. We can apply static keyword with variables,methods,
blocks and nested classes.
 */

public class StaticVariable 
{
  int id;
  String name;
  static String clg = "GNIET";
  
  public StaticVariable(int id, String name)
  {
	  this.id = id;
	  this.name = name;
  }
  
  public void Display()
  {
	  System.out.println("Student ID:- "+id+" "+"Name of Student:- "+name+" "+"College:- "+clg);
  }
}

