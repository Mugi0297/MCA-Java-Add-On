package session_09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Operation {

	//Database URL, username and password
	static final String DB_URL = "jdbc:mysql://localhost:3306/employeedb";
	static final String USER = "root";
	static final String PASS = "root";
	
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		
		try {
			
			//Step 1: Register JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2: Open Connection
			connection = DriverManager.getConnection(DB_URL, USER, PASS);
			
			//Step 3: Create Statement
			statement = connection.createStatement();
			
			//Step 4: Create Table
			String createTableSQL = "CREATE TABLE IF NOT EXISTS Employees("
					+ "ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,"
					+ "Name VARCHAR(50) NOT NULL,"
					+ "Age INT NOT NULL,"
					+ "Department VARCHAR(50) NOT NULL)";
			
			statement.executeUpdate(createTableSQL);
			System.out.println("Table 'Employees' created or already exists.");
			
			//Step 5: Insert Records
			String insertSQL = "INSERT INTO Employees(Name, Age, Department)VALUES "
					+ "('Mugilan', 27, 'Full Stack Development'),"
					+ "('Sudhesh', 28, 'Web Development'),"
					+ "('Jeeva', 35, 'HR')";
			int rowInserted = statement.executeUpdate(insertSQL);
			System.out.println(rowInserted+ " record(s) inserted....");
			
			//Step 6: List Records
			System.out.println("Listing Records..... ");
			String selectSQL = "SELECT * FROM Employees";
			ResultSet resultSet = statement.executeQuery(selectSQL);
			
			while(resultSet.next()) {
				System.out.println("ID: "+resultSet.getInt("ID")
				+ ", Name: "+resultSet.getString("Name")
				+ ", Age: "+resultSet.getInt("Age")
				+ ", Department: "+resultSet.getString("Department"));
			}
			
			//Step 7: Delete Records
			String deleteSQL = "DELETE FROM Employees WHERE Name = 'Jeeva'";
			int rowDeleted = statement.executeUpdate(deleteSQL);
			System.out.println(rowDeleted+ " record(s) deleted..");
			
			//Step 8: List Records After deletion
			System.out.println("Listing records after deletion....");
			resultSet = statement.executeQuery(selectSQL);
			
			while(resultSet.next()) {
				System.out.println("ID: "+resultSet.getInt("ID")
				+ ", Name: "+resultSet.getString("Name")
				+ ", Age: "+resultSet.getInt("Age")
				+ ", Department: "+resultSet.getString("Department"));
			}
			
			//Step 9: Update Record
			String updateSQL = "UPDATE Employees SET Age=30 WHERE Name='Sudhesh'";
			int rowUpdated = statement.executeUpdate(updateSQL);
			System.out.println(rowUpdated+" record(s) updated");
			
			//Step 10: Listing updated records
			System.out.println("Listing records after updation....");
			resultSet = statement.executeQuery(selectSQL);
			
			while(resultSet.next()) {
				System.out.println("ID: "+resultSet.getInt("ID")
				+ ", Name: "+resultSet.getString("Name")
				+ ", Age: "+resultSet.getInt("Age")
				+ ", Department: "+resultSet.getString("Department"));
			}
			resultSet.close();
			
		}catch(SQLException se) {
			
			se.printStackTrace();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}finally {
			//Step 11: Clean-up Environment
			try {
				
				if(statement != null) statement.close();
				if(connection != null) connection.close();
				
			}catch(SQLException se) {
				
				se.printStackTrace();
				
			}
		}
		System.out.println("Goodbye!..");
	}
}
