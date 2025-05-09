package studentManagement;


import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

			StudentDAO dao = new StudentDAO();

			while (true) {
				System.out.println("\n---Student Management---");
				System.out.println("1.Add Student");
				System.out.println("2.View All Students");
				System.out.println("3.Update Student");
				System.out.println("4.Delete Student");
				System.out.println("5.Exit");
				System.out.print("Choose an option: ");

				int choice = scanner.nextInt();
				scanner.nextLine();
				switch (choice) {
				case 1:
					System.out.print("Enter the name: ");
					String name = scanner.nextLine();

					System.out.print("Enter age: ");
					int age = scanner.nextInt();
					scanner.nextLine();

					System.out.print("Enter course: ");
					String course = scanner.nextLine();

//					Student newStudent = new Student(name, age, course);
					dao.addStudent(name, age, course);
					System.out.println("Student added.");
					break;

				case 2:
					List<Student> students = dao.getAllStudents();

					if (students.isEmpty()) {
						System.out.println("No Students Found.");
					} else {
						for (Student s : students) {
							System.out.println(s);
						}
					}
					break;

				case 3:
					System.out.print("Enter student ID to update: ");
					int updateId = scanner.nextInt();
					scanner.nextLine();

					System.out.print("Enter the new name: ");
					String newName = scanner.nextLine();

					System.out.print("Enter the new age: ");
					int newAge = scanner.nextInt();
					scanner.nextLine();

					System.out.print("Enter the new course: ");
					String newCourse = scanner.nextLine();

					dao.updateStudent(updateId, newName, newAge, newCourse);
					System.out.println("Student updated.");
					break;
					
				case 4: 
					System.out.print("Enter student ID to delete: ");
					int deleteId = scanner.nextInt();
					scanner.nextLine();
					dao.deleteStudent(deleteId);
					System.out.println("Student deleted.");
					break;
					
				case 5: 
					System.out.println("Goodbye!...");
					return;
					
				default:
					System.out.println("Invalid option.");
				}
		}

		} 
	}

