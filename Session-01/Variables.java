package session_01;

public class Variables {

	int a; //variable declaration
	float f = 35.247f; //variable initialization //instance variable
	static int b = 35; //static variable
	
	/**
	 * 
	 * Variable types
	 * -->instance variable
	 * -->static variable
	 * -->Local variable
	 * 
	 */
	static void display() { //static method
		double d = 56.3547890;  //local variable
		System.out.println("Double value: "+d);
		System.out.println("Local variable");
	}
	
	public int value() { //concrete method
		int c = 25;
		System.out.println("Concrete method");
		System.out.println(c);
		return c;
		
	}
	public static void main(String[] args) {//main method
		int h = 56; //local variable
		System.out.println(b);
		display();
		Variable1.name();
		System.out.println(h);
		
		/**
		 * -->Non static method or variables need to access through object of the class
		 * if its been declared in same class or other class
		 * 
		 * -->static method or variable can be access directly if its inside class
		 * 
		 * -->if static method or variable are declared in another class means 
		 * need to access through class name. 
		 * 
		 * -->static method and variable can be accessed through class object 
		 * but it shows warning.
		 */
		Variables var = new Variables();
		System.out.println(var.f);
		var.value();
		
		Variable1 obj = new Variable1();
		obj.print();
//		obj.name();
	}
}





