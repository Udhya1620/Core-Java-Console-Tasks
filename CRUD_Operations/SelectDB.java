package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectDB {

	public static void main(String[] args) {
	
	  String query  = "select * from employee";
	
	  try {
		  
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql:"
				+ "//localhost:3306/javademodb", "root","accord");

		PreparedStatement pst = con.prepareStatement(query);

        ResultSet result = pst.executeQuery();
		
		while(result.next()) {
			
			int num = result.getInt("Eid");
			
		    String fname = result.getString("First_name");
		    
		    String lname = result.getString("Last_name");
		    
		    String date = result.getString("Date_of_join");
		    
		    String department = result.getString("department");
			
		    String salary = result.getString("salary");
			
			System.out.println(num + "   "+fname+ "    "+ lname + "    " +date + 
					"    " +department + "     " + salary );
			
		}
	} 
	  catch (ClassNotFoundException | SQLException e) {
	
		e.printStackTrace();
		
	}
	  
	}

}
