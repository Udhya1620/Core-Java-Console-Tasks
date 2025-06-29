package serialiationAndDeserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Deserialization {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
			System.out.println("Enter the name of the student");

			String name = scanner.nextLine();

			String fileName = "D:\\Assignments\\2. Java Assignments\\" + "Serialization and deserialization\\folder1\\"
					+ name + ".ser";

			File file = new File(fileName);

			if (file.exists()) {

				FileInputStream fileInputStream = new FileInputStream(file);

				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

				Student student = (Student) objectInputStream.readObject();

				fileInputStream.close();

				objectInputStream.close();

				System.out.println();

				System.out.println("Register number : " + student.getRegNo());

				System.out.println("Name : " + student.getName());

				int marks1[] = student.getSubjects();

				for (int i = 0; i < marks1.length; i++) {
					System.out.println("Subject " + (i + 1) + " " + marks1[i]);
				}
			}

			else {

				System.out.println("The file does not exists");

			}
		}

		catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		scanner.close();

	}

}
