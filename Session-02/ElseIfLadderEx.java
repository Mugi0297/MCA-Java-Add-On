package session_02;

import java.util.Scanner;

public class ElseIfLadderEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the ticket price: ");
		
		int price = sc.nextInt();
		 
		if(price>=60 && price<=120) {
			
			System.out.println("Seat from 1 to 30");
			
		}else if(price>121 && price<=180) {
			
			System.out.println("Seat from 31 to 60");
			
		}else if(price>181 && price <=300) {
			
			System.out.println("Seat from 61 to 100 ");
			
		}else if(price>301){
			
			System.out.println("Special cabin");
			
		}else {
			
			System.out.println("Invalid value");
			
		}
	}
}
