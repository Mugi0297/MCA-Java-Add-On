package session_07;

public class ExceptionEx4 {

	public static void checkNum(int num) {
		if(num<1) {
			throw new ArithmeticException("\n Number is negative or zero can't calculate square");
			
		}else {
			System.out.println("Square of "+num+" is "+(num*num));
		}
	}
	
	public static void main(String[] args) {
		checkNum(-5);
	}
}
