package J7part1;

import java.util.Scanner;

public class VowelsAndConsonants {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word : ");
		String s1 = scan.nextLine();
		int vowels = 0;
		int consonants = 0;
        scan.close();
		for (int i = 0; i < s1.length(); i++) {
			s1.toLowerCase();
			char c = s1.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
			} else {
				consonants++;
			}
		}
		System.out.println("Total no of Vowels : " + vowels);
		System.out.println("Total no of Consonants : " + consonants);

	}

}
