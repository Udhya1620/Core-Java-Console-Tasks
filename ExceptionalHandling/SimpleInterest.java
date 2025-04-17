package ExceptionalHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleInterest {
	
	public static void main (String[] args) {
	Scanner scan = new Scanner(System.in);
	
	try {
	System.out.println("Enter principle(p) number"); 
	 int p = scan.nextInt();
	 System.out.println("Enter no of years in number"); 
	int n = scan.nextInt();
	 System.out.println("Enter rate of interest in number"); 
	int r = scan.nextInt();
	scan.close();
	System.out.println("Simple interest : "+(p*n*r)/100);
	}
	
	catch(InputMismatchException e) {
		System.out.println("Invalid number");
	}
	catch(ArithmeticException e) {
		System.out.println("Avoid dividing by zero");
	 }
	}
}
