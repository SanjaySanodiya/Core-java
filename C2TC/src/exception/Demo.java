package exception;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
    	   
    	   int a = 100;
    	   int b = 0;
    	   
    	   System.out.println(a/b);
    	   
       }catch(ArithmeticException e) {
    	   
    	   System.out.println("ArithmeticException Occurs");
       }
           System.out.println("Rest of the code");
	}

}
