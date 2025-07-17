package learn;

public class Assignment3q2 {
	public static void main(String[]args) {
		try {
			String[]colour= {"Red","Blue","Green","Yellow","Golden"};
			System.out.println("First favourite colour: "+colour[1]);
			System.out.println("The second favourite colour is: "+colour[7]);
		
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(NullPointerException e) {
			System.out.println(e);
		}
	}
}
