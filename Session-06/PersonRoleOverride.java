package session_06;

public class PersonRoleOverride extends Person{

	//implicit overriding
	public void inHouse() {
		System.out.println("To fullfill the needs of their parents");
	}
	
	public void inOffice() {
		System.out.println("Work as Developer");
	}
	
	public static void main(String[] args) {
		Person pro = new PersonRoleOverride(); //polymorphism
		pro.inHouse();
		pro.inOffice();
		
	}
}
