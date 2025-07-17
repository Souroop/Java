package github;
class Vehicle{
	void accelerate() {
		System.out.println("Vehicle can accelerate.");
	}
	void gear() {
		System.out.println("Vehicle can change gears.");
	}
}
class Car extends Vehicle{
	void accelerate() {
		System.out.println("Car can accelerate.");
	}
	void gear() {
		System.out.println("Car can change gears.");
	}
	void floating() {
		System.out.println("Car can not float. ");
	}
}
public class Method_Overriding {

	public static void main(String[] args) {
		Car car=new Car();
		car.accelerate();
		car.gear();
		car.floating();	
		
	}

}
