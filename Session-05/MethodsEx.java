package session_05;

public class MethodsEx {

	/**
	 * Definition:
	 * -->A method is a block of code (or) collection of statements, (or) a set
	 * of code grouped together to perform certain task or operation.
	 * 
	 * Uses:
	 * -->To achieve code reusability.
	 * -->To write a method once and use it many times.
	 * -->Provide easy modification and readability.
	 * -->The method is executed only when we call or invoke it.
	 * 
	 * 2 types of methods:
	 *  1.User-defined method
	 *  2.Built-in method (or) standard library method (or) Pre-defined 
	 * 
	 * Syntax: user-defined
	 * public int sum(int a, int b)
	 * {
	 * 
	 * 		//method body
	 * 
	 * }
	 * public int sum(int a, int b)-->Method header
	 * public-->Access specifier
	 * int-->Return type
	 * sum-->Method Name
	 * (int a, int b)-->Parameter List
	 * sum(int a, int b)-->Method Signature
	 * 
	 * Note:
	 * -->if value not passed means its called argument.
	 * -->if the value passed for the argument means its called parameter.
	 */
	String name; //variable declaration
	int rollno;
	
	void display() { //non-parameterized method or default
		System.out.println("<----Default method---->");
		System.out.println("Name: "+name);
		System.out.println("Roll-no: "+rollno);
	}
	
	void print(String name, int rollno ) { //Parameterized method
		System.out.println("<----Parameterized method---->");
		System.out.println("Name: "+name);
		System.out.println("Roll-no: "+rollno);
	}
	
	public static void main(String[] args) {
		MethodsEx me = new MethodsEx();
		me.display();
		me.print("Mugilan", 4128);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
