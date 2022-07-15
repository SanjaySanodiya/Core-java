package exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		try {
			int a[] = new int[5];
			
			a[5]=40/0;
			
			System.out.println(a[5]);

			
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
