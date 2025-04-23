package session_07;

import java.util.Scanner;

public class ValidateCustomAge {

	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		
		age = sc.nextInt();
		
		if(age<=0) {
			try {
				
				throw new AgeException();
				
			}catch(AgeException e) {
				
			}
		}else {
			System.out.println("Age entered is: "+age);
		}
		
	}
}
