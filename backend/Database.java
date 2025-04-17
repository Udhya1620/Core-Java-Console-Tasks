package backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database{
	public static void main(String[] args) {
	
		try {
			String query ="select * from employee";
			Class.forName("Com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc"
					+ ":mysql://localhost:3306/javademodb", "root", "accord");
		} 
		
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
}