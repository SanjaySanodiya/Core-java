package homework;

public class Loop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int start = Integer.MAX_VALUE-100;
		final int end = Integer.MAX_VALUE;
		int count=0;
		for(int i=start; i<=end;i++)
		{
			count++;
			System.out.println("Output=" +count);
		}
	}
}
