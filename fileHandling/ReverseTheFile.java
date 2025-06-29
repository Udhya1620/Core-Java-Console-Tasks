package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseTheFile {

	public static void main(String[] args) {

		try {
			
			String fname = "E:\\sample.txt";

			FileReader fr = new FileReader(fname);

			int b = 0;

			String s = "";

			while ((b = fr.read()) != -1) {
				 
				s = s + (char) b;
			}

			System.out.println(s);

			String rev = "";

			for (int i = 0; i < s.length(); i++) {
				rev = s.charAt(i) + rev;
			}

			fr.close();

			FileWriter fw = new FileWriter("D:\\sampleText.txt");

			fw.write(rev);

			fw.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
