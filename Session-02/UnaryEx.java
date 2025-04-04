package session_02;

public class UnaryEx {

	public static void main(String[] args) {
		int a = 10, b = 8, c;
		
		//negative
		/*System.out.println("negative: "+(-a));
		
		//positive
		System.out.println("postive: "+(+a));*/
		
		c = a++ + ++a + --a - a-- + b++ + --b - --b + ++b + ++a + ++b;
	/*  c = 10(11) + 12 + 11 - 11(10) + 8(9) + 8 - 7 + 8 + 11 + 9
	 *  c = 10 + 12 + 11 - 11 + 8 + 8 - 7 + 8 + 11 + 9         
	 *  c = 22 + 24 + 13
	 *  c = 46 + 13
	 *  c = 59 
	 *  */
		
		System.out.println("the result c: "+c);
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		/**
		 * pre-increment--->++expr
		 * post-increment-->expr++
		 * pre-decrement--->--expr
		 * post-decrement-->expr--
		 */
		
		
		
	}
}
