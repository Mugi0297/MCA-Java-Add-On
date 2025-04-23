package session_07;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
			
			//Outer try block
			int[] numbers = {1, 2, 3};
			int a = numbers[0];
			
			System.out.println("The value of a: "+a);
			
			try {
				
				//inner try block
				int b = numbers[3]; //ArrayIndexOutOfBoundsException
				System.out.println("The value of b: "+b);
				
			}catch(ArrayIndexOutOfBoundsException e) {
				//inner catch block
				System.out.println("Inner block Exception caught: "+e.getMessage());
				e.printStackTrace();
				
			}
		}catch(Exception e) {
			//outer catch block
			System.out.println("Outer block Exception caught: "+e.getMessage());
			e.printStackTrace();
			
		}finally {
			System.out.println("Finally block executed ...cleaning resouorces");
		}
	}
}
