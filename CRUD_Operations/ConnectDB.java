package CRUD_Operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ConnectDB {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the option : ");
		System.out.println("1 to delete by name ");
		System.out.println("2 to update the salary ");

		int num = scanner.nextInt();

		switch (num) {
		case 1:
			try {

				System.out.println("Enter the name : ");

				String name = scanner.nextLine();

				int count = 0;

				Class.forName("com.mysql.cj.jdbc.Driver");

				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javademodb", "root",
						"accord");

				String query = "delete from employee where First_name = " + "'" + name + "'";

				PreparedStatement preparedstatement = connection.prepareStatement(query);

				count = preparedstatement.executeUpdate();

				if (count == 1) {
					System.out.println("Executed");
				}

				else {
					System.out.println("Not Executed");
				}

			} catch (ClassNotFoundException | SQLException e) {

				e.printStackTrace();
			}

		case 2:
			//2.	Read employee id and new salary. Update new salary in table. Before updating, check
			//if the new salary is greater than the existing salary.
			
			System.out.println("Enter the id : ");
			
			int id = scanner.nextInt();
			
			System.out.println("Enter the new salary");
			
			int salary = scanner.nextInt();
			
			String query = "update employee set salary = ?  where EId = ? and salary < ? ";
			
			
			try {
				   int count = 0;
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javademodb","root","accord");
				
				PreparedStatement preparedStatement = connection.prepareStatement(query);
				
				preparedStatement.setInt(1, salary);
				
				preparedStatement.setInt(2, id);
				
				preparedStatement.setInt(3, salary);
				
				count = preparedStatement.executeUpdate();
				
				if(count == 1) {
					System.out.println("Salary updated");
				}
				else {
					System.out.println("Given salary should be greater then the previous salary");
				}
			} 
			catch (ClassNotFoundException | SQLException e) {
				
				System.out.println(e);
			}

		}

		
		scanner.close();
	}

}
