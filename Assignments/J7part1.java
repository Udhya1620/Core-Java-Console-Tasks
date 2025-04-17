package Assignments;

import java.util.Scanner;

public class J7part1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1. How to count a number of vowels and consonants in a given String?
//				Eg :
//				Input : program
//				Output:
//				Total no of vowels : 2
//				Total no of consonants : 5
		
		System.out.println("Enter a word : ");
		String s1 = scan.next();
		int vowels = 0;
		int consonants = 0;
		
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i) ;
			if( c == 'a' ||  c == 'e' ||  c == 'i' ||  c == 'o' ||  c == 'u' ) {
				vowels++;
			}
			else {
				consonants++;
			}
		}
		System.out.println("Total no of Vowels : " +vowels);
		System.out.println("Total no of Consonants : " +consonants);
		scan.close();
	}

}
