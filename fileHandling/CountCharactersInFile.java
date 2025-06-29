package fileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountCharactersInFile {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter the file location : ");
			
			String fileName = scan.nextLine();

			FileReader fileReader = new FileReader(fileName);

			int character;
			int count = 0;

			while ((character = fileReader.read()) != -1) {
				count++;
			}
			
			System.out.println("The count of characters : "+ count);
		} catch (IOException e) {
			System.out.println("error occurred");
		}
	}

}
