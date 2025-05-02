package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SalaryRange {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the starting range for salary : ");
		
		int startingRange = scan.nextInt();
		
		System.out.println("Enter the ending range for salary : ");
		
		int endingRange = scan.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost"
					+ ":3306/javademodb", "root", "accord");
			
			String query = "select * from employee where "
  + "salary between "+"'"+startingRange+"'"+" and "+"'"+endingRange+"'";
			
			PreparedStatement psd = con.prepareStatement(query);
			
			ResultSet result = psd.executeQuery();
			
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
			
		}
		
		
		catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		

	}

}
