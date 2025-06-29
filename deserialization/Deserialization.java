package deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Deserialization {

	public static void main(String[] args) {
		
		
	Scanner scan = new Scanner(System.in);
		
		try {
			
		System.out.println("Enter the name of the employee : ");

		String name = scan.nextLine();
		
		String fname = "E:\\name1"+name+".ser";
		
	    File fileObj = new File(fname);
	    
	    if(fileObj.exists())
	    	
	    {
				
				FileInputStream fileInputStream = new FileInputStream(fileObj);
				
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
				
				Employee emp = (Employee) objectInputStream.readObject();
				
				fileInputStream.close();
				
				objectInputStream.close();
				
				System.out.println(emp.getId());
				
				System.out.println(emp.getName());
				
				System.out.println(emp.getSalary());
	    	
	    }
		
	    else {
	    	
	    	System.out.println("the file does not exist");
			
	    }
		
		}
		
		catch(IOException | ClassNotFoundException e ) {
			System.out.println("Error occurred in your program");
		} 
		
        scan.close();
	}




	}


