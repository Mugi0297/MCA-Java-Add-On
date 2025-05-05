package session_08;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {

		// Create a Map
		HashMap<Integer, String> countryCodes = new HashMap<Integer, String>();

		countryCodes.put(1, "USA");
		countryCodes.put(91, "India");
		countryCodes.put(44, "UK");

		// Display the map
		System.out.println("Original Map: " + countryCodes);

		// Update a value
		countryCodes.put(91, "Bharat");
		System.out.println("After Updating India to Bharat: " + countryCodes);

		// Remove an entry
		countryCodes.remove(44);
		System.out.println("After removing UK: " + countryCodes);

		// Check if map contains a key
		System.out.println("Contains key 91? " + countryCodes.containsKey(91));

		// Display all keys
		System.out.println("Keys: " + countryCodes.keySet());

		// Display all values
		System.out.println("Values: " + countryCodes.values());
	}
}
