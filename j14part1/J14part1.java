package j14part1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class J14part1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		

		try {
			
		System.out.println("Enter the name of the employee : ");

		String name = scan.nextLine();
		
		String fname = "E:\\name1"+name+".ser";
		
	    File fileObj = new File(fname);
	    
	    if(fileObj.exists()) {
	    	System.out.println("The file exists");
	    }
		
	    else {
	    	
	    	System.out.println("Enter the employee id ");
			
			int id = scan.nextInt();
			
			System.out.println("Enter the employee salary ");
			
			int salary = scan.nextInt();
			
			Employee emp  = new Employee(id,name,salary);
			
			System.out.println("Object is created");
			
			FileOutputStream fileOutputStream = new FileOutputStream(fileObj);
			
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			
			objectOutputStream.writeObject(emp);
			
			System.out.println("The file saved in "+ fname);
			
			objectOutputStream.close();
			
			fileOutputStream.close();
			
	    }
		
		}
		catch(IOException e ) {
			System.out.println("Error occurred in your program");
		}

        scan.close();
	}

}
