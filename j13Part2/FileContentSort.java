package j13Part2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileContentSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the file name : ");
	try {
			
			String fname = scan.nextLine();
			
			FileReader fr = new FileReader(fname);

			int b = 0;

			String s = "";

			while ((b = fr.read()) != -1) {
				 
				s = s + (char) b;
			}

			System.out.println(s);

			fr.close();
			
			String[] ar = s.split(" ");
			
			for(int i=0; i<ar.length; i++) {
				for(int j=i; j<	ar.length; j++)
				{
				if (ar[i].compareTo(ar[j])> 0)
				{
					
					String temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
				}
			}
			
			for(int i = 0; i<ar.length; i++) {
				System.out.print(ar[i]+" ");
			}
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
      scan.close();	
	}

}
