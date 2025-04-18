package problems;

import java.util.Scanner;

public class RemoveSpace {

	 public static void main (String args[]) {
		 
		 Scanner scanner = new Scanner(System.in);
			
		    String text = scanner.nextLine();
		    
		    String removeSpace = "";
		 
		    for(int i = 0; i<text.length(); i++) {
		    	char character = text.charAt(i);
		    	
		    	if(character == ' ') {
		    		continue;
		    	}
		    	else {
		    		removeSpace = removeSpace+text.charAt(i);
		    	}
		    }
		 System.out.println(removeSpace);
		 
		 scanner.close();
	 }
}
