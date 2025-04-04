package session_02;

import java.util.Scanner;

public class NestedIfElseEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******Blood Donation******");
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter your weight: ");
		int weight = sc.nextInt();
		
		if(age>18) {
			
			if(age>=19 && age<50 && weight>50) {
				
				System.out.println("Can donate blood");
				
			}else {
				
				System.out.println("Age and weight not under criteria");
				
			}
			
		}else {
			
			System.out.println("Age must be above 18");
			
		}
	}
}
