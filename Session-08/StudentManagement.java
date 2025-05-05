package session_08;

import java.util.ArrayList;

public class StudentManagement {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		//Add student data
		students.add(new Student("Harikesh", 23));
		students.add(new Student("Guru Raj", 25));
		students.add(new Student("Faizan", 24));
		
		//Iterating the student data
		for(Student names: students) {
			System.out.println(names);
		}
		
	}
}
