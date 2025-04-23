package session_07;

public class AgeException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Creating Custom Exception
	 */
	
	//constructor
	public AgeException() {
		System.out.println("Invalid value for age");
	}
	
	AgeException(String msg){
		
	}
}
