package exception;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
	    	   
	    	   int a = 100;
	    	   int b = 0;
	    	   
	    	   System.out.println(a/b);
	    	   
	       }catch(ArithmeticException e) {
	    	   
	    	   System.out.println("ArithmeticException Occurs");
	       }finally {
	    	   
	    	   System.out.println("Final block is always exicutes");
	       }
	           System.out.println("Rest of the code");
	}

}
