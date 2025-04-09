package session_05;

public class StringBuilderEx {

	public static void main(String[] args) {
		/**
		 * Important methods:
		 * -->append(String str)
		 * -->insert(int offset, String str)
		 * -->replace(int start, int end, String str)
		 * -->reverse()
		 */
		
		StringBuilder sb = new StringBuilder("Hello");
//		StringBuffer sb = new StringBuffer("Hello");
		
		//Append
		sb.append("World");
		System.out.println("After append: "+sb); //HelloWorld
		
		//Insert
		sb.insert(5, ",");
		System.out.println("After insert: "+sb); //Hello,World
		
		//Replace
		sb.replace(6, 11, "Java");
		System.out.println("After replace: "+sb); //Hello,Java
		
		//Reverse
		sb.reverse();
		System.out.println("After reverse: "+sb);
		
		//Delete
		sb.delete(0, 5);
		System.out.println("After delete: "+sb);
		
		//Contains
		String st = "Java Program"; //works only on String
		System.out.println("Check string present or not: "+st.contains("Java"));
	}
}
