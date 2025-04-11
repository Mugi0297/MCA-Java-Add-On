package session_06;

public class GrandChildCompany extends BranchCompany1 implements SubMinibranch {

	@Override
	public void extraMembers() {
		System.out.println("500 employees extra");
		
	}
	
	public static void main(String[] args) {
		GrandChildCompany gcc = new GrandChildCompany();
		
		gcc.parentCompany();
		gcc.branchMethod1();
		gcc.extraMembers();
	}

	
}
