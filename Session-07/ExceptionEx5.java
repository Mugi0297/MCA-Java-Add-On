package session_07;

public class ExceptionEx5 {

	public static void validateAge(int age) {
		
		if(age<=18) {
			throw new IllegalArgumentException("Age must be 18 or above");
		}else {
			System.out.println("Age is valid: "+age);
		}
		
	}
	
	public static void main(String[] args) {
		try {
			
			validateAge(15);
			
		}catch(IllegalArgumentException e) {
			
			System.out.println("Caught an exception: "+e.getMessage());
		
		}
		
		try {
			
			validateAge(20);
			
		}catch(IllegalArgumentException e) {
			
			System.out.println("Caught an exception: "+e.getMessage());
		
		}
		
	}
}
