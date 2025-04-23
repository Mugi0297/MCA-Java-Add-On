package session_07;

import java.util.Scanner;

public class ExceptionEx2 {

	public static void main(String[] args) {
		//ArithmeticException
		
		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the 1st number: ");
			int num1 = sc.nextInt();
			
			System.out.println("Enter the 2nd number: ");
			int num2 = sc.nextInt();
			
			int result = num1/num2;
			System.out.println("The result is: "+result);
			
		}catch(ArithmeticException e) {
			
			System.out.println("Division by zero....: "+e.getMessage());
			e.printStackTrace();
			
		}catch(Exception e) {
			System.out.println("Give the correct input value: "+e.getMessage());
			e.printStackTrace();
		}
	}
}
