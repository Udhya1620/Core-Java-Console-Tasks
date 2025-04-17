package ExceptionalHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

	try {
		
	System.out.println("Enter first number : ");
	int num1 = scan.nextInt();
    System.out.println("Enter second number");
	int num2 = scan.nextInt();
    scan.close();
System.out.println("Division of first and second number : " + (num1 / num2));
		}

		catch (InputMismatchException e) {
			System.out.println("Invalid number");
		} catch (ArithmeticException e) {
			System.out.println("Avoid dividing by zero");
		}
	}

}
