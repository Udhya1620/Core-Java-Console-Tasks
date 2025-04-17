
package Assignments;

import java.util.Scanner;

public class j6part1 {
	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number to check Armstrong or not : ");
		int n = scan.nextInt();
		int l = String.valueOf(n).length();
		int oNum = n;
		int sum = 0;
		while (n > 0) {
			int temp = n % 10;
			sum += Math.pow(temp, l);
			n = n / 10;
		}
		if (oNum == sum) {
			System.out.println("It is a Armstrong number");
		}

		else {
			System.out.println("It is not a Armstrong number");
		}
		System.out.println();

		
		
		// task 2 :
		
		// fibonacci series:
		System.out.print("Enter the n number to print the fibonacci series : ");
		int n2 = scan.nextInt(), a = 0, b = 1;

		if (n2 == 0) {
			System.out.println("Enter number greater than 0");
		}

		if (n2 == 1) {
			System.out.println(a);
		}

		if (n2 > 1) {
			System.out.print("The series are : ");
			for (int i = 0; i < n2; i++) {
				System.out.print(a + " ");
			    int c = a + b;
				a = b;
				b = c;	
				
			}
		}
		System.out.println("\n");

		
		
		// task 3 :

		// Convert a number to binary code:
		System.out.print("Enter a number :  ");
		int n3 = scan.nextInt();

		String binaryCode = "";

		if (n3 == 0) {
			System.out.println("Binary digit : 0");
		}
		while (n3 > 0) {
			int decimal = n3 % 2;
			binaryCode = decimal + binaryCode;
			n3 = n3 / 2;
		}
		System.out.println("Binary digit : " + binaryCode);
		System.out.println();

		// task 4 :
       
//      Read a number and display in words
       
		System.out.println("Enter a number to display in words : ");
		
		int n4 = scan.nextInt();
		
		String[] numbers = {"Zero", "One", "Two", "Three", "Four",
				"Five", "Six", "Seven","Eight","Nine"};
		
		String numInDigits = "";
		
		while(n4 > 0) {
			int numdigits = n4%10;
			numInDigits = numbers[numdigits]+" "+numInDigits;
			n4 = n4/10;	
		}
		
		System.out.println(numInDigits);
		System.out.println();
       
      //task 5 : 
      //Find nth term of series 1,3,6,10,15,21
       
       System.out.print("Enter a number to find the nth term : ");
       int n5 = scan.nextInt();
       
       System.out.println("The nth term of the series : "+n5*(n5+1)/2);
       scan.close();
	}
}