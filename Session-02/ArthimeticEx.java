package session_02;

import java.util.Scanner;

public class ArthimeticEx {

	public static void main(String[] args) {
		//int a = 5, b = 8; //Direct initialization
		
		Scanner sc = new Scanner(System.in);  //user defined input
		
		System.out.println("Enter the value for a: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the value for b: ");
		int b = sc.nextInt();
		
		//BODMAS--->()/*+-  ===>Bracket Of Division Multiplication Addition Subtraction
		
		System.out.println("Addition: "+(a+b));
		System.out.println("Subtraction: "+(a-b));
		System.out.println("Multiplication: "+(a*b));
		System.out.println("Division: "+(a/b));
		System.out.println("Modulus: "+(a%b));
		
	}
}
