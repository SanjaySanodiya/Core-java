package Encapsulation;

public class Day3_p1 {
	
	 int year_of_purchase;
	   String make;
	   int model;
	   double cost;
	   public void display1() {
	 	  System.out.println("Year of purchase:- " +2001);
	 	  System.out.println("Make:- " +"Suzuki");
	   }
	   public void display2() {
	 	  System.out.println("Model:- " +1999);
	 	  System.out.println("Cost:- " +20000);
	   }
	   public static void main(String[] args) {
			// TODO Auto-generated method stub

	 	Day3_p1 ob1 = new Day3_p1();
	 	ob1.display1();
	 	ob1.display2();
	 	
	 }
}
