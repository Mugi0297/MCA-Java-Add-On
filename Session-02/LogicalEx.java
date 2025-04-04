package session_02;

public class LogicalEx {

	public static void main(String[] args) {
		boolean condition1 = true, condition2 = false;
		
		System.out.println("Logical AND: "+(condition1 && condition2));
		System.out.println("Logical OR: "+(condition1 || condition2));
		System.out.println("Logical NOT: "+(!condition1));	
		
		/**
		 * Logical AND (0=false, 1=true)==>multiplication
		 * operand1     operand2    output(operand1 && operand2)
		 *     0            0         0
		 *     0            1         0
		 *     1            0         0
		 *     1            1         1
		 *     
		 * Logical OR (0=false, 1=true)==>Addition
		 * operand1     operand2    output(operand1 || operand2)
		 *     0            0         0
		 *     0            1         1
		 *     1            0         1
		 *     1            1         1
		 *     
		 * Logical NOT (0=false, 1=true)==>negation
		 * operand      output(!operand)
		 *     0            1
		 *     1            0
		 * 
		 * 
		 */
	}
}
