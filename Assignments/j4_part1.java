
package Assignments;

import java.util.Scanner;

public class j4_part1 {

	public static void main(String[] args) {

//		1.	Find the sum and average of an array
//		Eg : a={1,4,5,3,2}
//		Output:  Sum= 15 average = 3

		Scanner scanner = new Scanner(System.in);
//
//		int a[] = new int[5];
//		System.out.println("find sum and average of 5 values");
//		for (int i = 0; i < a.length; i++) {
//
//			String c = "th";
//			if (i == 0) {
//				c = "st";
//			} else if (i == 1) {
//				c = "nd";
//			} else if (i == 2) {
//				c = "rd";
//			}
//
//			System.out.println("Enter " + (i + 1) + c + " number");
//
//			a[i] = scanner.nextInt();
//		}
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		int average = sum / a.length;
//
//		System.out.println("Sum = " + sum + " Average = " + average);

//		System.out.println("Find the Largest number");
//
//		int[] a1 = new int[5];
//		for (int i = 0; i < a1.length; i++) {
//
//			String c = "th";
//			if (i == 0) {
//				c = "st";
//			} else if (i == 1) {
//				c = "nd";
//			} else if (i == 2) {
//				c = "rd";
//			}
//
//			System.out.println("Enter " + (i + 1) + c + " number");
//
//			a1[i] = scanner.nextInt();
//		}
//		
//		int largestnum = 0;
//		for (int i = 0; i < a1.length; i++) {
//			if (largestnum < a1[i])
//				largestnum = a1[i];
//		}
//		System.out.println("Largest number : " + largestnum);
//
//		System.out.println();
//		System.out.println();
//		System.out.println("Task 3");
//
//		System.out.println("Reverse the array :");
//		System.out.println("Enter the array length");
//		int arrayLength = scanner.nextInt();
//		int[] array = new int[arrayLength];
//		int[] reverseArray = new int[array.length];
//
//		for (int i = 0; i < array.length; i++) {
//
//			String c = "th";
//			if (i == 0) { c = "st"; } else if (i == 1) { c = "nd";
//			} else if (i == 2) {  c = "rd"; }
//
//			System.out.println("Enter " + (i + 1) + c + " number");
//
//			array[i] = scanner.nextInt();
//		}
//		int k = 0;
//
//		for (int i = array.length - 1; i >= 0; i--) {
//			reverseArray[k] = array[i];
//			k++;
//		}
//		
//		System.out.print("The reversed array are : ");
//		for(int i =0; i<reverseArray.length; i++) {
//		System.out.print(reverseArray[i]+" ");
//		}
//
//
//		System.out.println("Task 4");
//		Scanner scan = new Scanner(System.in);
//
//		int[] arrayEven = new int[10];
//        System.out.println("Enter 10 values : ");
//		for (int i = 0; i < arrayEven.length; i++) {
//			String c = "th";
//			if (i == 0) { c = "st"; } else if (i == 1) { c = "nd";
//			} else if (i == 2) {  c = "rd"; }
//
//			System.out.println("Enter " + (i + 1) + c + " number");
//			arrayEven[i] = scan.nextInt();
//		}
//		scan.close();
//        
//		System.out.println("Printing only even numbers in an array : ");
//		for (int i = 0; i < arrayEven.length; i++) {
//			if ((arrayEven[i] % 2) == 0) {
//				System.out.print(arrayEven[i] + " ");
//			}
//		}
//
//		System.out.println();
//		System.out.println();
//		System.out.println("Task 5");
//		System.out.println("Add 5 numbers to move zeros to end : ");
//
//		int[] a3 = new int[5];
//
//		for (int i = 0; i < a3.length; i++) {
//			String c = "th";
//			if (i == 0) {
//				c = "st";
//			} else if (i == 1) {
//				c = "nd";
//			} else if (i == 2) {
//				c = "rd";
//			}
//
//			System.out.println("Enter " + (i + 1) + c + " number");
//			a3[i] = scanner.nextInt();
//		}
//
//		
//		int front = 0;
//
//		for (int i = 0; i < a3.length; i++) {
//
//			if (a3[i] != 0) {
//				a3[front] = a3[i];
//				front++;
//			}
//		}
//
//		for (int i = front; i < a3.length; i++) {
//			a3[i] = 0;
//		}
//
//		System.out.println("After moving the zeros to last : ");
//		for (int i = 0; i < a3.length; i++) {
//
//			System.out.print(a3[i]+" ");
//		}

//		System.out.println();
//		System.out.println();
		
		//6. Write a Program to print Sum of even and odd elements in an array
		System.out.println("Task 6");
		
		System.out.println("Enter 5 numbers to show sum of even and odd numbers : ");
		int a4[] = new int[5];
		int odd = 0;
		int even = 0;
		
		
		for (int i = 0; i < a4.length; i++) {
			String c = "th";
			if (i == 0) {
				c = "st";
			} else if (i == 1) {
				c = "nd";
			} else if (i == 2) {
				c = "rd";
			}

			System.out.println("Enter " + (i + 1) + c + " number : ");
			a4[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < a4.length; i++) {

			if (a4[i] % 2 != 0) {
				odd += a4[i];
			} else {
				even += a4[i];
			}
		}
		System.out.println("The sum of odd and even numbers are : " + odd + ", " + even);

	}

}
