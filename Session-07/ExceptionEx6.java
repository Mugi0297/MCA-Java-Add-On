package session_07;

public class ExceptionEx6 {

	public static int divideNum(int a, int b) 
			throws ArithmeticException, ArrayIndexOutOfBoundsException  {
		
		int div = a/b;
		
		System.out.println(div);
		
		String[] name = {"Mugilan", "Java", "Info"};
		
		System.out.println(name[3]);
		return div;
	}
	
	public static void main(String[] args) {
	
		//ExceptionEx6 ee6 = new ExceptionEx6();
		
		try {
			
			divideNum(36, 6);
		
		}catch(ArithmeticException e) {
			
			System.out.println("Number cannot divide by 0");
			e.printStackTrace();
			
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array index is out of bound..");
			e.printStackTrace();
		
		}
	}
}
