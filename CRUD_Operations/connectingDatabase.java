package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class connectingDatabase {

	public static void main(String args[]) {

		try {

			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "accord");
            
			String query = "Select * from technologies";
			PreparedStatement pst = connection.prepareStatement(query);
			ResultSet result = pst.executeQuery();

			while (result.next()) {
				int a = result.getInt("id");
				String b = result.getString("name");
				System.out.println(a + " " + b);
			}
			connection.close();

		} catch (SQLException e) {

			System.out.println(e);
		}
	}
}
