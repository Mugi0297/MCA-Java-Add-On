package studentManagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	private Connection conn; //open
	
	public StudentDAO() throws SQLException{
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root" );
	}
	
	public void insertStudent(Student s) throws SQLException{
		String sql = "INSERT INTO students (name, age, course) VALUES (?, ?, ?)";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, s.getName());
		stmt.setInt(2, s.getAge());
		stmt.setString(3, s.getCourse());
		stmt.executeUpdate();	
	}
	
	public List<Student> getAllStudents() throws SQLException{
		List<Student> list = new ArrayList<Student>();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM students");
		
		while(rs.next()) {
			list.add(new Student(rs.getInt("id"),
					rs.getString("name"),
					rs.getInt("age"),
					rs.getString("course")));
		}
		return list;
	}
	
	public void updateStudent(int id, Student updateStudent) throws SQLException{
		String sql = "UPDATE students SET name = ?, age = ?, course = ? WHERE id = ?"; 
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setString(1, updateStudent.getName());
		stmt.setInt(2, updateStudent.getAge());
		stmt.setString(3, updateStudent.getCourse());
		stmt.setInt(4, id);
		stmt.executeUpdate();		
	}
	
	public void deleteStudent(int id) throws SQLException{
		String sql = "DELETE FROM students WHERE id = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);
		stmt.setInt(1, id);
		stmt.executeUpdate();	
	}
	
	public void close() throws SQLException{
		conn.close(); //close
	}
}
