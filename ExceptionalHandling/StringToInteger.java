package ExceptionalHandling;

import java.util.Scanner;

public class StringToInteger {

	
	public static void main(String[]args) {
		
	//1. Attempt to convert a string to an integer.
	
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Enter a number");
		String num = scan.nextLine();
		
		System.out.println("Datatype before conversion : "+ num.getClass().getSimpleName());
		
		int cNum = Integer.parseInt(num);
		
		System.out.println("Datatype after conversion : "+ ((Object)cNum).getClass().getSimpleName());
		
		scan.close();
		}
		catch(NumberFormatException e){
			System.out.println("Should give a number");
		}
		finally {
			System.out.println("The code executed properly");
		}
	}
	
}
