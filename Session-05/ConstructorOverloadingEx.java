package session_05;

public class ConstructorOverloadingEx {

	private String name; //instance variable
	private int regno;
	private String location;
	
	public ConstructorOverloadingEx(String name, int regno, String location) {
		this.name = name; // 'this'-->refer to the instance variable
		this.regno = regno;
		this.location = location;
	}
	
	/**
	 * -->Same constructor name and same number of argument and invoke the 
	 * argument
	 */
	
	public ConstructorOverloadingEx(String name, String location) {
		this(name, 0, location); //"this" to call another constructor
	}
	
	public ConstructorOverloadingEx(String name, int regno) {
		this(name, regno, null); //"this" to call another constructor
	}
	
	public void displayInfo() {
		System.out.println("Name: "+this.name);
		System.out.println("Reg-No: "+this.regno);
		System.out.println("Location: "+this.location);
	}
	
	public static void main(String[] args) {
		ConstructorOverloadingEx coe = new ConstructorOverloadingEx("Mugilan", 4128, "Vellore");
		ConstructorOverloadingEx coe1 = new ConstructorOverloadingEx("Sudhesh", "Tirupur");
		ConstructorOverloadingEx coe2 = new ConstructorOverloadingEx("Vasanth", 52);
		coe.displayInfo();
		coe1.displayInfo();
		coe2.displayInfo();
	}
}
