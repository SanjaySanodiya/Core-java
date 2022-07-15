package polymorphism;
/*
If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.
If we have to perform only one operation, having same name of the methods increases the readability of the program
 
Advantage of method overloading
Method overloading increases the readability of the program.

Different ways to overload the method
There are two ways to overload the method in java

1. By changing number of arguments
2. By changing the data type
 */

// METHOD OVERLOADIND BY CHANGING NO. OF PARAMETERS
public class Overloading {

    static int Add(int a, int b)
    {
    	
    	return a+b;
    }
    
    static int Add(int a, int b, int c)
    {
    	
    	return a+b+c;
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
      System.out.println(Overloading.Add(15,15));
      System.out.println(Overloading.Add(15,15,15));
	}

}



