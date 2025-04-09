package session_05;

public class CopyConstructorEx {

	/**
	 * -->There is no copy constructor in java
	 * -->However, we can copy the values from one object to another object
	 * like copy constructor in c++
	 */
	
	private String name;
	private int age;
	
	//Regular constructor
	public CopyConstructorEx(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//Copy constructor
	public CopyConstructorEx(CopyConstructorEx other) {
		this.name = other.name;
		this.age = other.age;
	}
	
	public void displayInfo() {
		System.out.println("Name: "+name+","+"Age: "+age);
	}
	
	public static void main(String[] args) {
		CopyConstructorEx original = new CopyConstructorEx("Mugilan", 27);
		CopyConstructorEx copy = new CopyConstructorEx(original);
		
		System.out.println("Orignal data");
		original.displayInfo();
		
		System.out.println("Copied data");
		copy.displayInfo();
	}
}
