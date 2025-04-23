package session_07;

import java.util.Scanner;

public class ExceptionEx1 {

	public static void main(String[] args) {
		//NumberFormatException
		
		int num1, num2, result;
		String snum1, snum2;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			/**
			 * Code to execute condition
			 */
			System.out.println("Enter the 1st number: ");
			snum1 = sc.next();
			System.out.println("Enter the 2nd number: ");
			snum2 = sc.next();
			num1 = Integer.parseInt(snum1);
			num2 = Integer.parseInt(snum2);
			result = num1 + num2;
			System.out.println("The result is: "+result);
			
		}catch(Exception e) {
			/**
			 * catch exception and show as msg
			 */
			System.out.println("Exception msg: "+e.getMessage());
			e.printStackTrace();
		}
		
		
		
	}
}
