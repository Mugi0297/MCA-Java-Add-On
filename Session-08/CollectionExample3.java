package session_08;

import java.util.HashMap;
import java.util.Map;

public class CollectionExample3 {

	public static void main(String[] args) {

		// Iterating for HashMap
		HashMap<Integer, String> codes = new HashMap<Integer, String>();

		codes.put(1, "Java");
		codes.put(2, "Python");
		codes.put(3, "Nodejs");

		for (Map.Entry<Integer, String> entry : codes.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
		}
	}
}
