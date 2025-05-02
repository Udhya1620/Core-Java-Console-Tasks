package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Database {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the first name : ");
			
			String fname = scanner.next();
			
			System.out.println("Enter the mobile number");
			
			long mobileNumber = scanner.nextLong();

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javademodb", "root","accord");

			String query = "insert into phonebook(firstname, mobile) values(?,?)";

			PreparedStatement pst = con.prepareStatement(query);

			//ResultSet result = pst.executeQuery();
			
	        pst.setString(1, fname);
	        
	        pst.setLong(2, mobileNumber);
	        
	        int count = pst.executeUpdate();
	        
	        
	        if(count == 1) {
	        	System.out.println("saved");
	   
	        }
	        
	        else {
	        	System.out.println("not saved");
	        }
	        
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		scanner.close();
	}
}
