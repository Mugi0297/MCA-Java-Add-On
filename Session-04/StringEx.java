package session_04;

public class StringEx {

	public static void main(String[] args) {
		/**
		 * String-->Non-primitive dataType
		 * It is immutable(Unchangeable)
		 * 
		 * Initialization can be done in 2 ways:
		 * 1.String Literal
		 * 2.String Object
		 * 
		 */
		
		//1.String Literal
		String name = "Mugilan"; //name-->String reference variable
		
		System.out.println("String Literal: "+name);
		
		//2.String Object
		String name1 = new String("Mugilan");
		
		System.out.println("String Object: "+name1);
		
		
		char[] ch = {'M', 'u', 'g', 'i', 'l', 'a', 'n'};
		String info = new String(ch); //same as 2
		
		System.out.println("char array to String: "+info);
		
		
		
		
		
		
		
	}
}
