package session_04;

public class Constants {

	public static final double PI = 3.14159;
	
	public void display() {
		int radius = 4;
		double area = Constants.PI*radius*radius;
		System.out.println("Result of area: "+area);
	}
	
	public static void main(String[] args) {
		Constants ct = new Constants();
		ct.display();
	}
}
