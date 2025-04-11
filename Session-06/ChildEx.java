package session_06;

public class ChildEx implements ParentInterface1, ParentInterface2{

	@Override
	public void assetsParent2() {
		System.out.println("House, 1.5-Acres land");
		
	}

	@Override
	public void propertyParent2() {
		System.out.println("1-plot");
		
	}

	@Override
	public void assetsParent1() {
		System.out.println("House, car, 2-bike");
		
	}

	@Override
	public void propertyParent1() {
		System.out.println("2-Acres land, 2-plots");
		
	}
	
	public static void main(String[] args) {
		
		ChildEx ce = new ChildEx();
		
		ce.assetsParent1();
		ce.propertyParent1();
		ce.assetsParent2();
		ce.propertyParent2();
	}

}
