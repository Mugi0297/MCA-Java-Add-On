package session_06;

public class AccessEncapsulation {

	public static void main(String[] args) {
		Encapsulation ee = new Encapsulation();
		
		ee.setName("Mugilan");
		ee.setRollno(4128);
		ee.setDept("B.E-CSE");
		ee.setCollege("SRM-VEC");
		ee.setLocation("Chennai");
		
		System.out.println("Name: "+ee.getName());
		System.out.println("Roll-No: "+ee.getRollno());
		System.out.println("Department: "+ee.getDept());
		System.out.println("College-name: "+ee.getCollege());
		System.out.println("Location: "+ee.getLocation());
	}
}
