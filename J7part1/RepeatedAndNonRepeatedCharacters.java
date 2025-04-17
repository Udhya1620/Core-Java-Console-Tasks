package J7part1;

import java.util.Scanner;

public class RepeatedAndNonRepeatedCharacters {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word : ");
		String s1 = "example";
		String repeatedCharacters = " ";
		String nonRepeatedCharacters = " ";
		scan.close();
		boolean alreadyAdded = false;
		
		for (int i = 0; i < s1.length(); i++) {
			char t1 = s1.charAt(i);
			boolean option = false;
			for (int j = 0; j < s1.length(); j++) {
				if(i != j) {
					
				char t2 = s1.charAt(j);
				
				if (t1 == t2) {
					option = true;
				}
			}		
		}
			if(option && !alreadyAdded) {
				repeatedCharacters = repeatedCharacters + t1;
				alreadyAdded = true;
			}
			
			if(!option) {
				nonRepeatedCharacters = nonRepeatedCharacters + t1;
			}}
		
		System.out.println("Total no of repeated Characters : " + repeatedCharacters);
		System.out.println("Total no of non repeated Characters : " + nonRepeatedCharacters);
		
		
	}
}
