package session_03;

public class Array2D {

	public static void main(String[] args) {
		
//		String[][] code1 = new String[3][2];
		
		String[][] code = {{"HTML ", "CSS"}, {"Bootstrap ", "JS"}, {"Java ", "Python"}}; 
	
		for(int i = 0; i<code.length; i++) {
			for(int j = 0; j<code[i].length; j++) {
				System.out.print(code[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("----Access using for each loop----");
		
		for(String[] a : code) { //convert 2D object to 1D
			for(String b : a) { //convert 1D object to variable
				System.out.println(b); //finally print
			}
		}
	}
}
