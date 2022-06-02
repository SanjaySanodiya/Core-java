package Oops;

public class programmer extends Employee 
{
    String lname = "Sharma";
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		programmer obj1 = new programmer();
		System.out.println(obj1.name);
		System.out.println(obj1.lname);
		obj1.MyMethod();
	}

}
