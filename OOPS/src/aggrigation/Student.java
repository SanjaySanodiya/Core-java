package aggrigation;

/*
Student has an object of Address, address object contains its own informations such as city, state, country etc.
In such case relationship is Student HAS-A address
 */
public class Student 
{
    int id;
    String name;
    Address address;
    
    public Student(int id, String name,Address address)
    {
    	this.id = id;
    	this.name = name;
    	this.address = address;
    }
    
    public void Display()
    {
    	System.out.println(id+" "+name);
    	System.out.println(address.city+" "+address.state+" "+address.country);
    }
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
     
		Address ad = new Address("Mumbai","Maharashtra","India");
		Address ad1 = new Address("Indore","MP","India");
		
		Student s = new Student(1234, "Varun", ad);
		Student s1 = new Student(1235, "Sachin", ad1);
		
		s.Display();
		System.out.println("******************************");
		s1.Display();
		System.out.println("******************************");

			
	
	}

}
