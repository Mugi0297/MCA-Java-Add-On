package session_05;

public class WrapperClassEx {

	public static void main(String[] args) {
		
		System.out.println("------Autoboxing-----");
//		int a = Integer.valueOf(50);
		Integer intVal = 50;
		Double doubleVal = 36.456789;
		Boolean bval = true;
		Character cval = 'M';
		
		System.out.println(intVal);
		System.out.println(doubleVal);
		System.out.println(bval);
		System.out.println(cval);
		
		System.out.println("-------Unboxing-------");
		int d1 = intVal; //Equivalent to==> intVal.intValue()
		double d2 = doubleVal;
		boolean d3 = bval;
		char d4 = cval;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		System.out.println("---Utility method from wrapper class---");
		int regno = Integer.parseInt("4128");
		double percentage = Double.parseDouble("93.75");
		boolean data = Boolean.parseBoolean("true");
		
		System.out.println(regno);
		System.out.println(percentage);
		System.out.println(data);
		
		
	}
}
