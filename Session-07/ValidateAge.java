import java.util.Scanner;

public class ValidateAge {

	public static void main(String[] args) {
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		
		//Assertion Error
		assert(age>0)&&(age<120);
		System.out.println("The entered age: "+age);
	}
}
