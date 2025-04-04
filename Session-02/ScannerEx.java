package session_02;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		/**
		 * int-->nextInt()
		 * float-->nextFloat()
		 * double-->nextDouble()
		 * long-->nextLong()
		 * short-->nextShort()
		 * String-->next(), nextLine()
		 * 
		 */
		
		System.out.println("1.Emp-Name");
		System.out.println("2.Emp-Id");
		System.out.println("3.Emp-Address");
		System.out.println("4.Emp-dept");
		System.out.println("5.Emp-Exp");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ur name: ");
		String name = sc.nextLine();  //name
		
		System.out.println("Enter ur Emp-id: ");
		int id = sc.nextInt();  //id
		
		sc.nextLine();
		
		System.out.println("Enter ur Address: ");
		String addr = sc.nextLine();
		
		System.out.println("Enter ur Department: ");
		String dept = sc.nextLine();
		
		System.out.println("Enter ur work exp: ");
		double exp = sc.nextDouble();
		
		System.out.println(name+" | "+id+" | "+addr+" | "+dept+" | "+exp);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
