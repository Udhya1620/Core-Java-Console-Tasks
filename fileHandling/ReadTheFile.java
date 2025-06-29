package fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class ReadTheFile {

	public static void main(String[] args) {

		try {
			String fname = "E:\\sampleText.txt";

			FileReader fr = new FileReader(fname);

			int b = 0;

			String s = "";

			while ((b = fr.read()) != -1) {  
				s = s + (char) b;
			}
			
			fr.close();

			System.out.println(s);

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
