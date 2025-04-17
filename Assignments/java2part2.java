
//Java Operators and Data Types 

package Assignments;

import java.util.Scanner;

public class java2part2 {
	public static void main(String args[]) {

		// task 1 : Read marks in 3 subjects and display total and average
//        System.out.println("Task 1 :");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter first subject mark : ");
//		int Java = scan.nextInt();
//		System.out.println("Enter second subject mark : ");
//		int WebDesign = scan.nextInt();
//		System.out.println("Enter third subject mark : ");
//		int J2ee = scan.nextInt();
//
//		int total = Java + WebDesign + J2ee; // total of 3 subjects
//		System.out.println("Total of 3 subject : " + total);
//
//		int average = total / 3; // average of 3 subjects
//		System.out.println("Average of three subjects : " + average);
//		
//		System.out.println("");
//		System.out.println("");

		// task 2 : Check if a number is positive or negative
		System.out.println("Task 2 :");
		System.out.println("Enter a number : ");
		int num = scan.nextInt();
		String output = (num > 0)?"It is a positive integer":(num == 0)?"It is a neutral integer":"It is a negative integer";
		System.out.println(output);
		System.out.println("");
		System.out.println("");

//		// task 3 : Check if the given year is leap or not
//		 System.out.println("Task 3 :");
//		System.out.println("Enter a year : ");
//		int year = scan.nextInt();
//
//		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
//			System.out.println("The given year is a leap year.");
//		} else {
//			System.out.println("The given year is not a leap year.");
//		}
//		System.out.println("");
//		System.out.println("");
//
//		// task 4 : Swap two numbers without using a third variable
//		System.out.println("Task 4 :");
//		System.out.println("Enter the value of a : ");
//		int a = scan.nextInt();
//		System.out.println("Enter the value of b : ");
//		int b = scan.nextInt();
//		
//		a = a + b;
//		b = a - b; // swapping the a and b integer
//		a = a - b;
//
//		System.out.println("The value of a is : " + a);
//		System.out.println("The value of b is : " + b);
		
	}
}