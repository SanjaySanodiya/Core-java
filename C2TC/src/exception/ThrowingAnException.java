package exception;

import java.io.FileNotFoundException;

public class ThrowingAnException {
	
	void proc() throws FileNotFoundException {
		
		try {
			
			throw new FileNotFoundException("From Exception");
			
		}catch(FileNotFoundException e) {
			
			System.out.println("Coutch inside demoproc");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		
		ThrowingAnException t = new ThrowingAnException();
		
		try {
		      t.proc();
		}catch(FileNotFoundException e) {
			System.out.println("Tecaught: " + e);
		}
		
	}
}