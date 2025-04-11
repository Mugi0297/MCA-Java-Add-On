package session_06;

public class NonAbstractEmployeeRole extends AbstractEmployeeEx{

	//Explicit overriding
	@Override //annotation
	public void futureDesignation() {
		System.out.println("Future Designation: Full-Stack Developer");
		
	}
	
	public static void main(String[] args) {
		NonAbstractEmployeeRole nmr = new NonAbstractEmployeeRole();
		
		nmr.name();
		nmr.designation();
		nmr.futureDesignation();
	}

}
