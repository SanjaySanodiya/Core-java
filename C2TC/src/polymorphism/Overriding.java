package polymorphism;


class Bike {
	
	public void run() {
		System.out.println("bike is running");
	}
}
public class Overriding extends Bike{

	public void run() {
		System.out.println("Bike is running At the speed of 100 Kmph");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Overriding obj = new Overriding();
		obj.run();
	}

}
