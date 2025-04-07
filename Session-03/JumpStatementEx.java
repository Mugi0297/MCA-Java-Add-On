package session_03;

public class JumpStatementEx {

	public static void main(String[] args) {
		for(int i = 1; i<=5; i++) {
			if(i==3) { //3==3
//				break; //Exit the loop
				continue; //Skip the value
			}
			System.out.println("Number: "+i);
		}
	}
}
