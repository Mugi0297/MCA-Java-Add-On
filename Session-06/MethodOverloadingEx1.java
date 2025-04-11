package session_06;

public class MethodOverloadingEx1 {

	//By changing the datatype
	public void add(int a, int b) {
		int c = a+b;
		System.out.println("The value of c: "+c);
	}
	
	public void add(float a, int b) {
		float d = a+b;
		System.out.println("The value of d: "+d);
	}
	
	public void add(double a, float b) {
		double d1 = a+b ;
		System.out.println("The value of d1: "+d1);
	}
	
	public static void main(String[] args) {
		MethodOverloadingEx1 moe1 = new MethodOverloadingEx1();
		
		moe1.add(10, 20);
		moe1.add(25.5f, 10);
		moe1.add(36.458, 45.89f);
	}
}
