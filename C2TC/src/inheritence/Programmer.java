package inheritence;

class Employee {
    String name = "Sam";
    
    public void MyMethod() 
    {
  	int age = 23;
  	float Salary = 40000;
  		
  	System.out.println("Age of Emp :"+age);
  	System.out.println("Salary :"+Salary);
    }

}

class Programmer extends Employee{
	
	String lname = "Sharma";
	
	public static void main(String[] args) {
		
		Programmer obj = new Programmer();
		System.out.println("Fistr Name :"+obj.name);
		System.out.println("Last Name :"+obj.lname);
		obj.MyMethod();
		
	}
}