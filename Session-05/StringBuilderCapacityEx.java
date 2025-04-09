package session_05;

public class StringBuilderCapacityEx {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println("Default capacity: "+sb.capacity()); //default-16
		
		sb.append("Java");
		System.out.println("After appending capacity: "+sb.capacity()); //now 16 allocated for Java
		
		/**
		 * formula:
		 * (old capacity*2)+2
		 * 
		 */
		
		sb.append("is a high-level program");
		System.out.println(sb.capacity()); // (16*2)+2=32+2=>34
		
		sb.append("language");
		System.out.println(sb.capacity()); // (34*2)+2=68+2=>70
		
	}
}
