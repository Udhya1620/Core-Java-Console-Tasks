package serialiationAndDeserialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Serialization {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {
		
			System.out.println("Enter the name of the student : ");

			String name = scanner.nextLine();

			String fileName = "D:\\Assignments\\2. Java Assignments\\" + "Serialization and deserialization\\folder1\\"
					+ name + ".ser";

			File file = new File(fileName);

			if (file.exists()) {
				System.out.println("The file already exists");
			} else {

				System.out.println("Enter the Roll No : ");
				int rollNo = scanner.nextInt();

				int marks[] = new int[5];

				for (int i = 0; i <= 4; i++) {
					if (i == 0) {
						System.out.println("Enter the " + (i + 1) + "st subject name :");
					} else if (i == 1) {
						System.out.println("Enter the " + (i + 1) + "nd subject name :");
					} else if (i == 2) {
						System.out.println("Enter the " + (i + 1) + "rd subject name :");
					}  else {
						System.out.println("Enter the " + (i + 1) + "th subject name :");
					}
					marks[i] = scanner.nextInt();
				}

				Student student = new Student(rollNo, name, marks);

				FileOutputStream fileOutputStream = new FileOutputStream(file);

				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

				objectOutputStream.writeObject(student);

				fileOutputStream.close();

				objectOutputStream.close();

				System.out.println();

				System.out.println("Register number : " + student.getRegNo());

				System.out.println("Name : " + student.getName());

				int marks1[] = student.getSubjects();

				for (int i = 0; i < marks1.length; i++) {
					System.out.println("Subject " + (i + 1) + " " + marks1[i]);
				}
			}

		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Give a proper Input");
		}
		scanner.close();
	}

}
