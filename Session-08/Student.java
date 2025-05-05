package session_08;

public class Student {

	//Variable Declaration
	String name;
	int age;
	
	//Parameterized Constructor
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	
	
	
}
