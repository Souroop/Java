package github;
class Factorial{
	int fact(int n) {
		int result;
		if (n==1) {
			result=1;
			
		}
		else {
			result=n*(n-1);
		}
		return result;
	}
}
public class Recursion1 {

	public static void main(String[] args) {
		Factorial f=new Factorial();
		System.out.println("The factorial of 3 is: "+f.fact(3));
		System.out.println("The factorial of 4 is: "+f.fact(4));
		System.out.println("The factorial of 5 is: "+f.fact(5));

	}

}
