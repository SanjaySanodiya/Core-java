package exception;

public class MultipleCatchBlock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try {
        	String str = null;
        	
        	System.out.println(str.equals("hello"));
        	
        }catch(ArithmeticException e) {
			
			System.out.println("ArithmeticException Occurs");
		
		}catch(ArrayIndexOutOfBoundsException e) {
		
			System.out.println("ArrayIndexOutOfBoundsException Occurs");
		
		}catch(Exception e) {
			
			System.out.println("Parent Exception Occurs");
		}
		
		    System.out.println("Rest of the code");
	}

}
