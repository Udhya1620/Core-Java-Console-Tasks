package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateDb {
	
	public static void main (String args[]) {
	
	 Scanner scanner = new Scanner(System.in);
	 
	try {
		
		System.out.println("Enter the old number : ");
		
		long oldNum = scanner.nextLong();
		
		System.out.println("Enter the new number : ");
		
		long newNum = scanner.nextLong();

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql"
				+ "://localhost:3306/javademodb", "root","accord");

		String query = "update phonebook set mobile =? where mobile = ?";

		PreparedStatement pst = con.prepareStatement(query);

		//ResultSet result = pst.executeQuery();
		
        pst.setLong(1, newNum);
        
        pst.setLong(2, oldNum );
        
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
