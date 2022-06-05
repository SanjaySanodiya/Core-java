package polymorphism;

// METHOD OVERLOADING BY CHANGING THE DATA-TYPE 

public class Overloading2 
{
    static int Addition(int a, int b)
    {
    	return a+b;
    }
    
    static double Addition(double a, double b)
    {
    	return a+b;
    }
    
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      System.out.println(Overloading2.Addition(45, 65));
      System.out.println(Overloading2.Addition(45.0,45.0));
	}

}
