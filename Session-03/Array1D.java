package session_03;

public class Array1D {

	public static void main(String[] args) {
		
		/***
		 * 
		 * two ways to initialize values
		 * -->Directly initialize elements to the arrayName
		 * -->Provide size and then initialize elements
		 *  
		 */
		//1.Direct initialization
		String[] name = {"Mugilan", "Sudhesh", "Vasanth"};
		
		System.out.println("----1.Accessing single element----");
		
		//Accessing the element using index
		System.out.println("Name: "+name[0]);
		
		/**
		 * Access all elements in array-->2 ways
		 * 1.Using length in for loop
		 * 2.Using for each loop (Enhanced for loop)
		 */
		
		//1.1. Access all elements
		System.out.println("----1.1.Access all elements using for loop----");
		
		for(int i=0; i<name.length; i++) {
			
			System.out.println(name[i]);
		}
		
		//1.2. Access all elements
		System.out.println("----1.2.Access all elements using for each loop----");		
		
		for(String name1 : name) {
			System.out.println(name1);
		}
		
		//2.Provide  size and make initialize elements
		int[] number = new int[5];
		
		number[0] = 25;
		number[1] = 36;
		number[2] = 54;
		number[3] = 64;
		number[4] = 77;
		
		System.out.println("----2.Accessing single element----");
		System.out.println("Number: "+number[2]);
		
		//2.2. Access all elements
		System.out.println("----2.1.Access all elements using for loop----");
		
		for(int j=0; j<number.length; j++) {
			System.out.println(number[j]);
		}
		
		System.out.println("----2.2.Access all elements using for each loop----");
	
		for(int m : number) {
			System.out.println(m);
		}
	}
}
