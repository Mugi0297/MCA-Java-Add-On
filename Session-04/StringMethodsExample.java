package session_04;

import java.util.Arrays;

public class StringMethodsExample {

	public static void main(String[] args) {
		
		//1.intern()
		String s1 = "Java Developer"; //String Literal
		String s2 = new String("Java Developer"); //String Object
		String s3 = s2.intern(); //s3 = "Java Developer"
		
		/**
		 * intern()-->Convert String Object to String Literal
		 * 
		 */
		System.out.println(s1==s2); //false
		System.out.println(s1==s3); //true
		
		//2.concat()
		String s4 = "Java ";
		String s5 = "Stack";
		String s6 = s4.concat(s5);
		System.out.println(s6);
		
		//3.length()
		String name = " Mugilan";
		int len = name.length();
		System.out.println(len);
		
		//4.equals()
		//5.equalsIgnoreCase()
		String username = "admin";
		String password = "Admin@123";
		
		if(username.equals("admin") && password.equalsIgnoreCase("admin@123")) {
			
			System.out.println("Loggedin to admin dashboard");
			
		}else {
			
			System.out.println("username or password incorrect");
			
		}
		
		//6.toLowerCase()
		String code = "JAVA";
		
		System.out.println(code.toLowerCase());
		
		//7.toUpperCase()
		String lower = "python";
		System.out.println(lower.toUpperCase());
		
		//8.charAt(int index)
		String str = "Program";
		char res = str.charAt(3);
		System.out.println(res);
		
		//9.getChars(int srcBegin, int srcEnd, char[] dist, int dstBegin)
		String str1 = new String("Welcome to java program");
		char[] ch1 = new char[6];
		str1.getChars(11, 15, ch1, 0);
		System.out.println(ch1);
		
		//10.toCharArray()
		String str2 = "JAVA PROGRAMMING";
		char[] ch2 = str2.toCharArray();
		System.out.println(Arrays.toString(ch2));
		for(char c1 : ch2) {
			System.out.println(c1); 
		}
		
		//11.subString()
		String str3 = "Hello World ";
		
		System.out.println(str3.substring(6)); //only beginIndex
		System.out.println(str3.substring(0, 5)); //both begin and end index
		
		//12.split() 
		/**
		 * jdk 1.4 -->introduced split method
		 */
		String code1 = "Object oriented Programming language";
		String[] str4 = code1.split("\\s");
		for(String data1: str4) {
			System.out.println(data1);
		}
		
		//13.join()
		String para = String.join("-", "Java", "Program");
		System.out.println(para);
		
		//14.trim()
		String info1 = "           SpringBoot Application";
		System.out.println(info1.trim());
		
		//15.compareTo(

		/**
		 * s1>s2-->positive
		 * s1<s2-->negative
		 * s1==s2-->0
		 */
		String st1 = "Hello";
		String st2 = "Heulo";
		int res1 = st1.compareTo(st2);
		System.out.println(res1);
		
		
	}
}
