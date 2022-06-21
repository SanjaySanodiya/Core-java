package polymorphism;

/* 
If subclass (child class) has the same method as declared in parent class. is known as Method Overriding in java

In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.

Usage of Java Method Overriding

Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
Method overriding is used for runtime polymorphism

Rules for Java Method Overriding

1. The method must have the same name as in the parent class
2. The method must have the same parameter as in the parent class.
3. There must be an IS-A relationship (inheritance).
 */

public class Overriding 
{
  void run()
  {
	  System.out.println("Vehical is running....");
  }
}

class Bike extends Overriding
{
	void run()
	{
		System.out.println("Bike is running safely....");
	}
	
	public static void main(String[] args) 
	{
		Bike b = new Bike();
		b.run();
	}
}