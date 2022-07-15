package exception;

public class TestPropagation {
	
	void m() {
		
		int data=50/0;
	}
	
	void n() {
		
		m();
	}
	
	void p() {
		
     try {
		  n();
		}catch(ArithmeticException e) {
			
			System.out.println("Catch the exception");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestPropagation t= new TestPropagation();
		t.p();
		
		System.out.println("Rest of Code");
		
		
	}

}
