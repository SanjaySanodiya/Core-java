package arrays;

public class Sum {

	public static void main(String[] args) {
		
		/*	decclare array and 
		initialize it with values. */
		
		int array[]= {10,20,30,40,50};
		
		//initialize sum variable with 0
		
		int sum=0;
		
		//add array elements
		
		for(int i=0; i<array.length; i++) {
		
			sum+=array[i];              //sum=sum+array[i];
	
		}
		
		//display the result
		
		System.out.println("Sum of array elements = " +sum);
		
	}
}