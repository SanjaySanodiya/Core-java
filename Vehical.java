package abstraction;

abstract class Vehical {
	
	  String vehicalName = "Honda City";
	  int modelName = 123;
	  
	  abstract void average();
	  abstract void speed();
}

class Car extends Vehical
{
	public void average()
	{
		System.out.println("Average of Car :" + "18-27 km");
	}
	public void speed()
	{
		System.out.println("Speed of a Car :" + "195 Km/h");
	}
	
   	public static void main(String[] args) 
	{
		Vehical B = new Car();
		System.out.println("Name of Vehical :"+B.vehicalName);
		System.out.println("Model Name :"+B.modelName);
		
		B.average();
		B.speed();
		
	}
}