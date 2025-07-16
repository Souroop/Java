package github;
 class Sum{
	public int sum(int x, int y) {
		return (x+y);
	}
	public int sum (int x,int y,int z) {
		return (x+y+z);
	}
	public double sum(double x,double y) {
		return(x+y);
	}
}
public class Method_overloading {

	public static void main(String[] args) {
		Sum s=new Sum();
		System.out.println(s.sum(60,40));
		System.out.println(s.sum(10,30,60));
		System.out.println(s.sum(60.5, 39.5));

	}

}
