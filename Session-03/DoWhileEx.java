package session_03;

public class DoWhileEx {

	public static void main(String[] args) {
		int a = 10;
		
		do {
			System.out.println("the value of a: "+a);
			a--; //Decrement
		}while(a>0);
		
		System.out.println("the final value of a: "+a); //0
			
	}
}
