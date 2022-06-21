package polymorphism;

public class Person 
{
  int id;
  String name;
  String email;
  
  Person( int id, String name, String email)
  {
	  this.id = id;
	  this.name = name;
	  this.email = email;
  }
}

class Emply extends Person
{
	double salary;
	String industry;
	
	Emply(double salary, String industry, int id, String name, String email)
	{
		super(id, name, email);
		this.salary = salary;
		this.industry = industry;
	}
	
	void Display()
	{
		System.out.println(id+" "+name+" "+email+" "+salary+" "+industry);
	}
	public static void main(String[] args) 
	{
		Emply e = new Emply(75000.00, "Capegemini", 1234, "Sam", "sam@gmail.com" );
		e.Display();
	}
}