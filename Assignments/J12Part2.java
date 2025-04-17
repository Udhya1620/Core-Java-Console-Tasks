package Assignments;

import java.util.InputMismatchException;

import java.util.Scanner;

import J12part2.AgeTooLargeException;
import J12part2.AgeTooLessException;
import J12part2.InvalidAgeException;
import J12part2.InvalidLocationException;
import J12part2.BankAccount;
import J12part2.InsufficientFundsException;

public class J12Part2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws InsufficientFundsException{
		
		
//		1. Loan Eligible Checking using Throw keyword
//		→ Location should be Chennai, Mumbai, Delhi or Kolkata. If any
//		other city, raise Invalid location Error.
//		→ Age should be minimum 23. If age is less than 23 Raise Invalid Age Error
		
		Scanner scan = new Scanner(System.in);
		try {
		System.out.println("Enter your location : ");
		
		String location = scan.nextLine();
		
		
		if((!location.toLowerCase().equals("chennai")) && (!location.toLowerCase().equals("madurai"))
				&&(!location.toLowerCase().equals("Delhi")) &&(!location.toLowerCase().equals("Kolkata")))
		{
			throw new InvalidLocationException(null);
		}
		System.out.println("Enter your age : ");
		int age = scan.nextInt();
		if(age<23){
			
			throw new InvalidAgeException(null);
		}
			System.out.println("Your are eligible to get the loan");
		}
		
		catch(InputMismatchException e){
			System.out.println(e.fillInStackTrace());
			scan.next();
			}
		
		catch(InvalidLocationException e){
			System.out.println(e.fillInStackTrace());
			}
		
		catch (InvalidAgeException e) {
			System.out.println(e.fillInStackTrace());
		}
		
		
		
//		2. Read age from user and check if age eligible to vote or not. Create and
//		throw custom exceptions, if age is given as negative.

		
		
		try {
			System.out.println("Enter a age in number : ");
		int a = scan.nextInt();
		if(a<=0) {
			
			throw new AgeTooLessException("Age cannot be negative");	
		}
		else if(a>=120){
			
		    throw new AgeTooLargeException("Invalid age");	
		}
		
		else if(a>=18) {
			System.out.println("Eligible to vote");
		}
		else {
			System.out.println("Not Eligible to vote");
		}
		
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a valid number");
			scan.next();
		} 
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
//		3. Create a Java program that demonstrates exception handling using
//		custom exceptions. The program should:
//		1. Define a custom exception called InsufficientFundsException.
//		2. Implement a class called BankAccount with a method
//		withdraw(double amount) that throws
//		InsufficientFundsException if the withdrawal amount is greater
//		than the current balance.
//		3. Handle the custom exception in the main method and print an
//		appropriate message.
//		4. Ensure that a message is printed indicating that the transaction
//		attempt is complete, regardless of whether an exception was
//		thrown.
		
		
		BankAccount bankaccount = new BankAccount();
		
		try {
			System.out.println("Enter the amount for the "
					+ "withdrawal : ");
			
		double amount = scan.nextDouble();
		
		bankaccount.withdraw(amount);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		scan.close();
	}

}
