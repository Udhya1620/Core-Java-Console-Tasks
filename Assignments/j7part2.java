package Assignments;

//import java.util.Scanner;

public class j7part2 {

	public static void main(String[] args) {

		//Scanner scan = new Scanner(System.in);

		// task 1:

//		1. Printing Floyd’s triangle pattern
//
//		1
//		2 3
//		4 5 6
//		7 8 9 10

		System.out.println("task 1 :");
		int k = 1;
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + " ");
				k++;
			}
			System.out.println();
		}

		// task 2 : 

//		2. Diamond Shape Pattern Program in Java
//
//		    *
//		   ***
//		  *****
//		 *******
//		*********
//		 *******
//		  *****
//		   ***
//		    *

		System.out.println("task 2 : ");
		for(int i = 5; i>=1; i--) {
			for(int j = 1; j<=5; j++) {
				if(i<=j)
				{
					System.out.print("* ");
				}
					else {
						System.out.print(" ");
					
				}
			}
			System.out.println();
		}
		for(int i = 2; i<=5; i++) {
			for(int j = 1; j<=5; j++) {
				if(i<=j)
				{
					System.out.print("* ");
				}
					else {
						System.out.print(" ");
					
				}
			}
			System.out.println();
		}
		

//		3. Zeros/ ones Pattern Programs
//
//		1
//		10
//		101
//		1010
//		10101

		System.out.println("Task 3 : ");
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print("0");
				} else {
					System.out.print("1");
				}
			}
			System.out.println();
		}

		
		//task 4 : 
		
//		4. Program to print hollow rectangle or square star patterns
//
//		* * * * * *
//		*         *
//		*         *
//		*         *
//		*         *
//		*         *
//		* * * * * *
		System.out.println("Task 4 : ");
		for(int i = 1; i<=6; i++) {
			for(int j = 1; j<=12; j++ ) {
				if(i == 1  || j == 1 || i == 6 ||j ==12) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
//		5. Diamond shape composed of Numbers
//		   1
//		  212
//		 32123
//		4321234
//		 32123
//		  212
//		   1
		
		System.out.println("Task 5 : ");

	for (int i = 1; i<=5; i++) {
		for(int j = 1; j<=5-i; j++) {
			System.out.print(" ");
		}
		for(int k1 = i; k1>=1; k1--) {
			System.out.print(k1);
		}
		for(int l = 2; l<=i; l++) {
			System.out.print(l);
		}
		System.out.println();
	}
	      
	for (int i = 4; i>=1; i--) {
		for(int j = 1; j<=5-i; j++) {
			System.out.print(" ");
		}
		for(int k1 = i; k1>=1; k1--) {
			System.out.print(k1);
		}
		for(int l = 2; l<=i; l++) {
			System.out.print(l);
		}
		System.out.println();
	}
		
	}
}