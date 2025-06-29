package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ImageCopyPaste {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter the file to copy : ");

			String fileName = scan.nextLine();

			File file = new File(fileName);

			if (file.exists()) {

				FileInputStream fileInput = new FileInputStream(file);

				System.out.println("Enter the destination file : ");

				String fileDestination = scan.nextLine();

				byte[] byteCopy = fileInput.readAllBytes();

				FileOutputStream fileOutput = new FileOutputStream(fileDestination);

				fileInput.close();

				fileOutput.write(byteCopy);
				fileOutput.close();

				System.out.println("The file copied");
			}

			else {
				System.out.println("File not found");
			}
		}

		catch (IOException e) {

			e.printStackTrace();

			System.out.println("An error occured ");

		}
		scan.close();
	}
}