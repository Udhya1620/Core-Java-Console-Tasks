package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class employeeDetails {

	public static void main(String[] args) {

	
		String query = "Select * from employee";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://local"
					+ "host:3306/javademodb","root","accord");
			
			PreparedStatement pst = con.prepareStatement(query);
			
			ResultSet result = pst.executeQuery();
			
			while(result.next()) {
				String id = result.getString("Eid");
				
				String fname = result.getString("first_name");
				
				String department = result.getString("department");
				
				int salary = result.getInt("salary");
				
				System.out.println(id + " "+fname + " "+ department + " "+ salary);
				
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			
			System.out.println(e);
		}
		
	}

}
