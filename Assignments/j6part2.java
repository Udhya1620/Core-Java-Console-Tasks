package Assignments;

import java.util.Scanner;

public class j6part2 {

	public static void main(String[] args) {

//		1. Find the Largest and Second largest number from an array?
//				Input :
//				a =[8,9,3,6,2,4,9]
//				Output:
//				Second LargestNumber : 9
//				Second Smallest Number : 8

		int n1[] = { 8, 9, 3, 6, 2, 4, 9 };

		int largestnumber = 0;
		int secondlargest = 0;

		for (int i = 0; i < n1.length; i++) {
			if (largestnumber < n1[i]) {
				secondlargest = largestnumber;
				largestnumber = n1[i];
			} else if (secondlargest < n1[i] && n1[i] != largestnumber) {
				secondlargest = n1[i];
			}
		}
		System.out.println(largestnumber);
		System.out.println(secondlargest);
//		
//		2.	In a given array, change every alternate number into negative numbers.
//		Input : [5,9,1,3,7,4,-5]
//		Output: [5,-9,1,-3,7,-4,5]

		int input[] = { 5, 9, 1, 3, 7, 4, -5 };
		System.out.println("Array input : ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < input.length; i++) {
			if (i % 2 == 1 || input[i] < 0) {
				input[i] = input[i] * -1;
			}
		}

		System.out.println("Array output : ");
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();

//		3.	Sort the array in ascending order?
//				Input : a =[8,9,3,6,2,4]
//				        Output:
//				   Ascending Order : [2,3,4,6,8,9]

		int input3[] = { 5, 9, 1, 3, 7, 4, -5 };
		System.out.println("Before sorting : ");
		for (int i = 0; i < input3.length; i++) {
			System.out.print(input3[i] + " ");
		}
		System.out.println();

		for (int i = 0; i < input3.length; i++) {

			for (int j = i + 1; j < input3.length; j++) {
				if ((input3[i]) > (input3[j])) {
					int temp = input3[j];
					input3[j] = input3[i];
					input3[i] = temp;

				}
			}
		}

		System.out.println("After sorting : ");
		for (int i = 0; i < input3.length; i++) {
			System.out.print(input3[i] + " ");
		}

		System.out.println();
		System.out.println();

//4.	How to find the first non-repeating element in an array of integers?
//Input : a =[2,3,6,2,5,6]
//Output : First non-repeating number : 3

		int a4[] = { 2, 3, 6, 2, 5, 6 };

		for (int i = 0; i < a4.length; i++) {

			int count = 0;

			for (int j = 0; j < a4.length; j++) {

				if (a4[i] == a4[j]) {
					count++;
				}

			}
			if(count == 1) {
			 System.out.println("The first non repeating number : "+a4[i]);
			 break;
			}
		}

		

		System.out.println();
		
//5. Program to count number of occurrences of each array value.

		int a5[] = { 2, 3, 6, 2, 5, 6 };

		int secondA5[] = new int[a5.length];

		for (int i = 0; i < a4.length; i++) {

			int count = 0;

			for (int j = 0; j < a4.length; j++) {

				if (a5[i] == a5[j]) {
					count++;
				}

			}
			secondA5[i] = count;
		}

		System.out.println("The given array : ");
		for (int i = 0; i < a5.length; i++)
			System.out.print(a5[i] + " ");

		System.out.println();

		System.out.println("The count number of each array value : ");
		for (int i = 0; i < a5.length; i++)
			System.out.print(secondA5[i] + " ");
		
		
		Scanner sc = new Scanner(System.in);
		
		String so = sc.next();
		System.out.println(so);
		sc.next();
		sc.next();
		String so1 = sc.nextLine();
		
		System.out.println(so1);
	}

}
