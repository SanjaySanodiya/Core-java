package abstraction;

class Car extends Vehical
{
	public void average()
	{
		System.out.println("18-27 km");
	}
	public void speed()
	{
		System.out.println("195 Km/h");
	}
	
   	public static void main(String[] args) 
	{
		Vehical B = new Car();
		System.out.println("Name of Vehical "+B.vehicalName);
		System.out.println("Model Name "+B.modelName);
		
		B.average();
		B.speed();
		
	}
}
