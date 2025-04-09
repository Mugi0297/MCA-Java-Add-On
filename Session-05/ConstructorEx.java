package session_05;

public class ConstructorEx {

	/**
	 * Definition:
	 * -->Constructor is a block of code similar to method.
	 * -->Constructor as method has class-name
	 * 
	 * Usage:
	 * -->It is called when the instance(object) of the class is created.
	 * -->At the time of calling constructor, memory for the object is allocated
	 * in the memory of constructor.
	 * -->Every time an object is created using new() keyword, atleast one 
	 * constructor is called.
	 * 
	 * 2 types of constructors:
	 * 1.Non-Parameterized constructor(no-arguments) or default
	 * 2.Parameterized constructor(with arguments)
	 * 
	 */
	String location;
	int zipcode;
	
	public ConstructorEx(){
		System.out.println("Default Constructor");
		location = "Vellore";
		zipcode = 632517;
	}
	
	public ConstructorEx(String name, int age){
		System.out.println("Parameterized constructor");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
	
	void displayInfo() {
		System.out.println("Location: "+location);
		System.out.println("Zip-code: "+zipcode);
	}
	
	public static void main(String[] args) {
		ConstructorEx ce = new ConstructorEx();
		ConstructorEx ce1 = new ConstructorEx("Mugilan", 27);
		ce.displayInfo();
	}
}
