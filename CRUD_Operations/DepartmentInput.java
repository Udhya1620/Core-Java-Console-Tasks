package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DepartmentInput {

	public static void main(String[] args) {
		
Scanner scanner = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the department name : ");
			
			String department = scanner.next();

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javademodb", "root","accord");

			String query = "select * from employee where department = "+"'"+department+"'";

			PreparedStatement pst = con.prepareStatement(query);

			ResultSet result = pst.executeQuery();
			
			while(result.next()) {
				
				int num = result.getInt("Eid");
				
			    String fname = result.getString("First_name");
			    
			    String lname = result.getString("Last_name");
			    
			    String date = result.getString("Date_of_join");
			    
			    String department1 = result.getString("department");
				
			    String salary = result.getString("salary");
				
				System.out.println(num + "   "+fname+ "    "+ lname + "    " +date + 
						"    " +department1 + "     " + salary );
			}
	        
			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		scanner.close();
	}

}
