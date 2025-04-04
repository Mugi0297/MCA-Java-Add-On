package session_02;

public class ShiftEx {

	public static void main(String[] args) {
		System.out.println(5>>2); //Right Shift=> formula->5/2^2==>5/4=1
		System.out.println(5<<2); //Left Shift==> formula->5*2^2==5*4=20
		System.out.println(5<<3); //==>5*2^3==>5*8=40
		
		/**
		 * 5=>0101
		 * 5>>2
		 * -->0 1 0 1
		 * -->0 0 1 0==>1st shift
		 * -->0 0 0 1==>2nd shift
		 * -->8 4 2 1==>1
		 * 
		 * 5<<2
		 * -->0  0 1 0 1
		 * -->0  1 0 1 0==>1st shift
		 * -->1  0 1 0 0==>2nd shift
		 * -->16 8 4 2 1==>20
		 * 
		 * 
		 */
	}
}
