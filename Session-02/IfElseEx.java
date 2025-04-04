package session_02;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		
		if(age>20) {
			
			System.out.println("Eligible to vote");
			
		}else {
			
			System.out.println("Not eligible to vote");
			
		}
		
	}
}
