package session_08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionExample1 {

	public static void main(String[] args) {
		
		/* Adding and Accessing Elements in Collection */
		
		/**
		 * List-->Duplicates Allowed
		 * Set--->Duplicates will not be added
		 */
		//Syntax
		
		//Interface with class
		List<String> list = new ArrayList<>(); 
		
		//class
		ArrayList<String> arrlist = new ArrayList<>();
		
		//class
		LinkedList<String> linklist = new LinkedList<>();
		
		//Adding the data
		list.add("Java");
		list.add("Python");
		list.add("NodeJs");
		list.add("Nextjs");
		list.add("Java"); //Duplicates Allowed
		
		//Accessing the data
		System.out.println("List info: "+list);
		
		Set<String> set = new HashSet<>();
		
		TreeSet<String> treeset = new TreeSet<>();
		
		//Adding the data
		set.add("TVS");
		set.add("Yamaha");
		set.add("Honda");
		set.add("Yamaha"); //Duplicates will not be allowed
		
		//Accessing the data
		System.out.println("Set info: "+set);
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
		
		//Adding the data
		map.put(1, "HTML5");
		map.put(2, "CSS3");
		map.put(3, "Bootstrap");
		
		System.out.println("Map info before update: "+map);
		
		map.put(1, "Reactjs"); //Based on key value will be updated
		
		//Accessing the data
		System.out.println("Map info after update: "+map);
		
		
		
		
	}
}
