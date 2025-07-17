package learn;
interface Flyable{
	void fly();
}
interface Swimmable{
	void swim();
}
class Duck implements Flyable,Swimmable{
	String name;
	public Duck(String name) {
		this.name=name;
	}
	public void fly() {
		System.out.println(name+" is flying!!");
	}
	public void swim() {
		System.out.println(name+" is Swimming!!");
	}
	public void displayDetails() {
		System.out.println("Duck Name: "+name);
		System.out.println("Abilities: ");
		fly();
		swim();
	}
}
public class Eight {
	public static void main(String[]args) {
		Duck duck=new Duck("Donald");
		System.out.println("Duck Details: ");
		duck.displayDetails();
	}
}
