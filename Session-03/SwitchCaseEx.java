package session_03;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		
		System.out.println("Select ur language: ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur choice (1/2/3/4): ");
		int ch = sc.nextInt();
		
		//String role = sc.next();
		
		switch(ch) { //instead ch use role
		
		case 1: System.out.println("Tamil"); //1 ==>admin ""
				break;
		
		case 2: System.out.println("English"); //2 ==>tester
				break;
			
		case 3: System.out.println("Telugu"); //3 ==>developer
				break;
				
		case 4: System.out.println("Hindi"); //4 ==>hr
				break;
		
		default: System.out.println("Invalid Enter correct choice");
		}
		
		
	}
}
