package github;
class Employee{
	String name;
	int salary;
	public Employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	void displayEmployeeInfo() {
		System.out.println("NAME: "+ name);
		System.out.println("SALARY: "+salary);
	}
}
class Manager extends Employee{
	String department;
	public Manager(String name,int salary,String department) {
		super(name,salary);
		this.department=department;
	}
	void displayManagerInfo() {
		super.displayEmployeeInfo();
		System.out.println("Department: "+department);
	}
}

	
	


public class Inheritance {

	public static void main(String[] args) {
		Manager manager=new Manager("Alex",78000,"Information Technology");
		System.out.println("Manager details: ");
		manager.displayManagerInfo();
		

	}

}
