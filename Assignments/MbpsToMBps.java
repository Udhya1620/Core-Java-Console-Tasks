package Assignments;

import java.util.Scanner;

public class MbpsToMBps {

	public static void main(String[] args) {
		
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the speed in Mega bits per second (Mbps) : ");
		double n = scan.nextInt();
		
		System.out.println(n+" Mbps"+" is equals to "+(n*0.125)+" Mega bytes per second ");
	}

}
