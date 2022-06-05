package Oops;

public class Animal 
{
	 public void Eat() 
	  {
		  System.out.println("Eating.....");
	  }
		  
}
class Elephent extends Animal{
	  
	 public void Sound() 
	  {
		  System.out.println("trumpet");
	  }  
	
	public static void main(String[] args) 
	{
		Elephent ob = new Elephent();
		ob.Eat();
		ob.Sound();
		
	}
}