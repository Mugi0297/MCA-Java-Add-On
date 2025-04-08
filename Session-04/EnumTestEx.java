package session_04;


public class EnumTestEx {

	enum Program{HTML, CSS, BOOTSTRAP, JS, JAVA, PYTHON};
	/**
	 * 
	 * Keyword used for enumeration-->enum
	 * 
	 * Syntax:
	 * enum enum-name{constant1, constant2, .....};
	 * 
	 * Rules:
	 * -->Enum is a datatype which contains fixed set of constants.
	 * -->Naming convention: All Enumn constants in capital letter.
	 * -->Java Enum ,constants are static and final implicitly.
	 * -->Enums can be thought of as classes which have fixed set of constants. 
	 */
	public static void main(String[] args) {
		for(Program p : Program.values()) {
			System.out.println(p);
		}
		
		/**
		 * 
		 * value()-->To access all the values stored in an enum-name.
		 * 
		 */
	}
}
