
package Assignments;

import java.util.Scanner;

public class java3_part2 {

	public static void main(String[] args) {

		System.out.println("Task 1");     // task 1
		Scanner scan = new Scanner(System.in);

		System.out.println("enter which table to print : ");
		int n = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + i * n);
		}
		

		System.out.println();
		System.out.println();
		System.out.println("Task 2");     // task 2
		
		System.out.println("Enter the a multiple digit number to split the digits : "); 
		int number = scan.nextInt();

		while (number != 0) {
			int seperate = number % 10;
			System.out.println(seperate);
			number = number / 10;
		}
		
		

		System.out.println();
		System.out.println();
		System.out.println("Task 3");     // task 3
		System.out.println("Find the product of two numbers without usig the * operator"); 
		System.out.println("Enter first number : "); 
		int num1 = scan.nextInt();
		System.out.println("Enter second number : "); 
		int num2 = scan.nextInt();

		int product = 0;

		for (int i = 0; i < num2; i++) {

			product = product + num1;
		}

		System.out.println("The product of two number is : "+product);

		
		
		System.out.println();
		System.out.println();
		System.out.println("Task 4");      // task 4
        System.out.println("Enter a number : ");
		int num = scan.nextInt();
		scan.close();
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.println("accord");
			} else if (i % 5 == 0) {
				System.out.println("infomatrix");
			} else if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("infomatrix");
			} else {
				System.out.println("The number is : " + i);
			}

		}

	}

}
