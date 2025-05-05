package session_08;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample2 {

	public static void main(String[] args) {
		
		/**
		 * Class_Name<>--->Generic Class
		 * Mathod_Name<>()-->Generic Method
		 * 
		 * Iterating through Collections
		 * 
		 * 2 ways to iterate
		 * --->Using for-each loop
		 * --->Using Iterator
		 */
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Mugilan");
		names.add("Sudhesh");
		names.add("Vasanth");
		names.add("Moses");
		
		System.out.println("<--1.Using for-each loop-->");
		
		//1.Using for-each loop
		for(String name: names) {
			System.out.println(name);
		}
		
		//2.Using Iterator
		
		Iterator<String> iterate = names.iterator();
		
		System.out.println("<----2.Using Iterator---->");
		
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		
		
		
	}
}
