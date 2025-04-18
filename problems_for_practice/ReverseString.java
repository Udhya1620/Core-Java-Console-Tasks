package J7part1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
	    String text = scanner.nextLine();
	    
	    String array[] = text.split(" ");
	    
	    for(int i = 0; i<array.length;i++) {
	    	
	    	for(int j = array[i].length()-1; j>-1 ; j--) {
	    		
		    	System.out.print(array[i].charAt(j));
		    }
	    	System.out.print(" ");
	    	
	    }
	    scanner.close();
	   
	}
}
