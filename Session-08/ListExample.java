package session_08;

import java.util.ArrayList;

public class ListExample {

	public static void main(String[] args) {

		// Create a list
		ArrayList<String> mobiles = new ArrayList<String>();

		mobiles.add("Samsung s24");
		mobiles.add("One plus 11");
		mobiles.add("Iphone 15 pro");

		// Display the list
		System.out.println("Original List: " + mobiles);

		// Add at Specific Index
		mobiles.add(1, "Oppo F23");
		System.out.println("After Adding Oppo F23: " + mobiles);

		// Update an element
		mobiles.set(2, "Realme 15");
		System.out.println("After updating Realme 15: " + mobiles);

		// Remove by value
		mobiles.remove("Iphone 15 pro");
		System.out.println("After removing Iphone 15 pro: " + mobiles);
		
		// Check if the list contains the element
		System.out.println("Contains Samsung s24?: "+mobiles.contains("Samsung s24"));
		
		// Get the size of the list
		System.out.println("Size of List: "+mobiles.size());
	}
}
