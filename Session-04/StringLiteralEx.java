package session_04;

public class StringLiteralEx {

	public static void main(String[] args) {
		
		//String Literal
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = " World";
		
		//compare 2 StringLiteral using == operator
		System.out.println("Before modifing s1: "+(s1==s2));
		
		String s4 = s1+s3;
		s1 = s1+s3; //+-->Concatenation
		/**
		 * 2 types of memory to store String values:
		 * 
		 * -->SCP-->String Constant Pool-->String literal data stored
		 * -->Heap Memory
		 * 
		 */
		
		//compare 2 StringLiteral using == operator
		System.out.println(s1==s2); //false
		
		System.out.println("The data stored in s4: "+s4); //Hello World
		System.out.println("The data stored in s1: "+s1); //Hello World
	}
}
