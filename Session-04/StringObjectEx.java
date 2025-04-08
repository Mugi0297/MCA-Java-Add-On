package session_04;

public class StringObjectEx {

	public static void main(String[] args) {
		
		//String Object
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = new String(" World");
		
		/**
		 * 2 types of memory to store String Object
		 * -->SCP-->String Constant Pool-->1 copy stored in scp
		 * -->Heap Memory-->another copy stored here
		 * 
		 * SCP:
		 * --->SCP did not have duplicate value.
		 * --->String reference variable point the value if its been 
		 *     same data in another reference variable.
		 * 
		 * Heap Memory:
		 * --->Heap memory can have duplicate value.
		 * 
		 */
		
		//compare 2 string object using == operator
		System.out.println("Before modifing s1: "+(s1==s2)); //false
		
		String s4 = s1+s3;
		s1 = s1+s3;
		
		System.out.println("The data stored  in s4: "+s4); //Hello World
		System.out.println("After modifing s1: "+s1); //Hello World
		
	}
}
