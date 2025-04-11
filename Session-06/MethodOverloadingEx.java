package session_06;

public class MethodOverloadingEx {

	/**
	 * 2 ways to overload the method
	 * -->By changing the number of arguments.
	 * -->By changing the datatype.
	 * 
	 */
	int d;
	
	//By changing the number of arguments
	public void add(int a, int b) {
		 d = a+b;
		System.out.println("The value of d is: "+d);
	}
	
	public void add(int a, int b, int c) {
		 d = a+b+c;
		 System.out.println("The value of d is: "+d);
	}
	
	public static void main(String[] args) {
		MethodOverloadingEx moe = new MethodOverloadingEx();
		
		moe.add(10, 20);
		moe.add(10, 15, 25);
	}
}
